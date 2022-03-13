package com.company.OtherChallenges.ProblemSolving;

import java.util.List;

// TODO: 3/12/2022 Ask Cliff about bug in tester. Exception was given but answer is inline with similar answers.
public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int answer = 0;
        int biggestNum = 0;

        for (int candle : candles) {
            if (candle > biggestNum) {
                biggestNum = candle;
                answer++;
            } else if (candle == biggestNum) {
                answer++;
            }

        }
        return answer;
    }

}
