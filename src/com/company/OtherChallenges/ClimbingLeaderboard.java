package com.company.OtherChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*NOTES FOR ALGORITHM
 * 2D Loop
 *
 * Going thru the ranked board each item..wasting time.
 * */
//        for (int i = 0; i < ranked.size(); System.out.println(i)) {
//            ranked.set(i, ranked.get(i) * i);
//            i++;
//        }
//        System.out.println(ranked);
//code flow

//        return answer;

// TODO: 3/8/2022 Finish algorithm
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
public class ClimbingLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i = player.size() - 1; i > 0; i--) {
            for (int j = 0; j < ranked.size(); System.out.println(j)) {
                if (player.get(i) >= ranked.get(j)) {
                    answer.add(j);
                    break;
                }
                j++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        List<Integer> rankedTest = Arrays.asList(100, 100, 50, 40, 40, 20, 10);
        List<Integer> playerTest = Arrays.asList(5, 25, 50, 120);
        //expecting 6, 4, 2, 1

        System.out.println(climbingLeaderboard(rankedTest, playerTest));
    }

    /*
7 - ranked
100 100 50 40 40 20 10
4 - player
5 25 50 120*/


}
