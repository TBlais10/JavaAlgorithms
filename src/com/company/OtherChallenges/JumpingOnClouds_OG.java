package com.company.OtherChallenges;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true
// TODO: 3/8/2022 Finish algorithm - Test case 4 is the only one failing.

import java.util.ArrayList;
import java.util.List;

/*
 * Need to return how many 'jumps' it takes to reach the end of the list.
 * If there are more than two 0s in a row, increase i + 2 and add 1 to the return (size of the list - 1 to avoid null pointer?)
 * if 1 is found, move to the next index and do not count towards return.
 *
 *
 * */

public class JumpingOnClouds_OG {

    public static int jumpingOnClouds(List<Integer> c) {
        int answer = -1;
        int count = 0;

        while (count != c.size()) {
            if (count + 2 < c.size() && c.get(count + 2) == 0) {
                count += 2;
            } else {
                count++;
            }
            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(0);
        test.add(0);
        test.add(1);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(1);
        test.add(0);
        test.add(0);
        //listof

        System.out.println(jumpingOnClouds(test)); //expecting 6
    }

}
