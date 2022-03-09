package com.company.OtherChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// TODO: 3/8/2022 Finish algorithm
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
public class ClimbingLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < player.size() ; i++) {
            int currentPlayer = player.get(i);

            for (int j = 0; j < ranked.size() - 1; j++) {
                int currentRank = ranked.get(j);

                if (Objects.equals(ranked.get(j + 1), ranked.get(j))){
                    ranked.remove(j);
                }

                if (currentPlayer >= currentRank){
                    answer.add(j + 1);
                    break;
                }

            }

        }
        return answer;
    }

    /*
7 - ranked
100 100 50 40 40 20 10
4 - player
5 25 50 120*/


}
