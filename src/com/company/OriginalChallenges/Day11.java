package com.company.OriginalChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
*
*
* --EDGE CASES
* All negative numbers...
* How can current code implement tracking negative numbers?
* Add to the checks for biggest num.
* */

public class Day11 {

    public static int solution(List<List<Integer>> arr){

        List<Integer> answer = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() -2; j++) {
                total += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                total += arr.get(i + 1).get(j + 1);
                total += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

               answer.add(total);
                total = 0;
            }
        }
        return Collections.max(answer);
    }

    public static void main(String[] args) {
        List<List<Integer>> test = new ArrayList<>();
        test.add(Arrays.asList(1, 1, 1, 0 ,0, 0));
        test.add(Arrays.asList(0, 1, 0, 0 ,0, 0));
        test.add(Arrays.asList(1, 1, 1, 0 ,0, 0));
        test.add(Arrays.asList(0, 0, 2, 4 ,4, 0));
        test.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        test.add(Arrays.asList(0, 0, 1, 2 ,4, 0));

        List<List<Integer>> test2 = new ArrayList<>();
        test2.add(Arrays.asList(-1 ,-1 ,0 ,-9, -2 ,-2));
        test2.add(Arrays.asList(-2 ,-1 ,-6 ,-8 ,-2, -5));
        test2.add(Arrays.asList(-1 ,-1 ,-1 ,-2 ,-3 ,-4));
        test2.add(Arrays.asList(-1 ,-9 ,-2 ,-4 ,-4 ,-5));
        test2.add(Arrays.asList(-7 ,-3 ,-3 ,-2 ,-9 ,-9));
        test2.add(Arrays.asList(-1, -3, -1, -2, -4, -5));


//        System.out.println(solution(test)); //should return 19
        System.out.println(solution(test2)); //should return -6 works with collections.max
    }

    /*-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5*/

}
