package com.company.OtherChallenges.ProblemSolving;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long smallSum = 0;
        long hugeSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1) {
                smallSum += arr.get(i);
            }
            if (i >= 1) {
                hugeSum += arr.get(i);
            }
        }

        System.out.println(smallSum + " " + hugeSum);

    }

}
