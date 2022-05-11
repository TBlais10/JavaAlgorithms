package com.company.HackerRankAlgorithms.ProblemSolving;

import java.util.List;

public class VeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        long answer = 0;

        for (Long num :
                ar) {
            answer += num;
        }
        return answer;
    }
}
