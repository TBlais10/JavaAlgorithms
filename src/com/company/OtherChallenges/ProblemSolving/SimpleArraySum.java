package com.company.OtherChallenges.ProblemSolving;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        Integer answer = 0;
        for (Integer num : ar){
            answer += num;
        }

        return answer;
       }
    }
