package com.company.HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/
public class MaximumSum {


    public static String algorithm(String args){
        List<Integer> array = new ArrayList<>();

        for (String num : args.split(" ")) {
            array.add(Integer.parseInt(num));
        }

        long total = 0;
        long biggestNum = Long.MIN_VALUE;
        int subset = 0;
        for (int num : array) {
            if (num > biggestNum){
                biggestNum = num;
            }
            if (!(num < 0)){
                total += num;
                subset++;
            }
        }

        if (total == 0){
            subset = 1;
            total = biggestNum;
        }

        return total  +  " " + subset;
    }

    public static void main(String[] args) {
//        System.out.println(algorithm("1 2 -4 -2 3"));
        System.out.println(algorithm("-100000")); //should be 10000 ... edge case
    }
}
