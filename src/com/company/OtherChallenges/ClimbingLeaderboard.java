package com.company.OtherChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// TODO: 3/8/2022 Finish algorithm
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
public class ClimbingLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        List<Integer> answer = new ArrayList<>();

        for (int currentPlayer : player) {

            int count = 0;
            for (int j = 0; j < ranked.size(); j++) {

                int currentRank = ranked.get(j);

                if (currentPlayer >= currentRank) {
                    count = j;
                    break;
                }

            }
            if (currentPlayer <= ranked.get(ranked.size() - 1)) {
                answer.add(ranked.size() -1);
            } else {
                answer.add(count);
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
