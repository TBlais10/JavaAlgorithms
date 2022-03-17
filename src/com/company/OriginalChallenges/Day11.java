package com.company.OriginalChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
/*Ideas for approaching the solution
*
* We need to have a group of code that returns an 'hour glass' from the array and in each combination get the highest sum.
*
* 1 1 1
*   1
* 1 1 1
*
* [0][0], [0][1], [0][2]
*         [1][1]
* [2][0], [2][1], [2][2]
*
* does not count zeros?... but checks for the greatest sum of hourglasses.
* get the sums
*
* code? we loop only through two lists.
*
*if the place in the array does not equal 0, add it to a variable.
* if you hit zero, reset the count and that count equals a new variable.
* */

public class Day11 {

    public static int solution(List<List<Integer>> arr){

        int total = 0;
        int biggestTotal = 0;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() -2; j++) {
                total += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                total += arr.get(i + 1).get(j + 1);
                total += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (total > biggestTotal){
                    biggestTotal = total;
                }

                total = 0;
            }

        }
        return Math.max(total, biggestTotal);
    }

    public static void main(String[] args) {
        List<List<Integer>> test = new ArrayList<>();
        test.add(Arrays.asList(1, 1, 1, 0 ,0, 0));
        test.add(Arrays.asList(0, 1, 0, 0 ,0, 0));
        test.add(Arrays.asList(1, 1, 1, 0 ,0, 0));
        test.add(Arrays.asList(0, 0, 2, 4 ,4, 0));
        test.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        test.add(Arrays.asList(0, 0, 1, 2 ,4, 0));


        System.out.println(solution(test));
    }

}
