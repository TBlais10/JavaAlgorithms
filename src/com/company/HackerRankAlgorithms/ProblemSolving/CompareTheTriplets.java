package com.company.HackerRankAlgorithms.ProblemSolving;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoints = 0;
        int bPoints = 0;

        for (int i = 0; i < a.size(); i++) {
            if (!Objects.equals(a.get(i), b.get(i)) && a.get(i) > b.get(i)) {
                aPoints++;
            }
            if (!Objects.equals(a.get(i), b.get(i)) && a.get(i) < b.get(i)) {
                bPoints++;
            }
        }
        return  Arrays.asList(aPoints, bPoints);
    }

}
