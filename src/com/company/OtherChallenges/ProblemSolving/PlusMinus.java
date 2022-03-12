package com.company.OtherChallenges.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double pos = 0;
        double neg = 0;
        double zero =0;

        for (Integer num : arr) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println(pos/arr.size() + "\n" + neg/arr.size() + "\n" + zero/ arr.size());
    }

    public static void main(String[] args) {
//        plusMinus(Arrays.asList(1, 2, 3, -1, -2, -3, 0 ,0));
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

}
