package com.company.twenty_twenty_two.InterviewPrep;

import java.util.Arrays;
import java.util.List;

public class PermMissingElem {


/*Given a list of numbers, but one is missing. Will be in any order
* Array/List is given.
* Example is given 2, 3, 1, 5
* List could be given hundreds of numbers
*
* Tools to use:
* Sort first
*
* */


    public static int solution(int[] a){
        if (a.length == 0){
            return 0;
        }

        long total = 0;
        long actualTotal = a.length + 1;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
            actualTotal += i + 1;
        }

        return (int)(actualTotal - total);
    }

    public static void main(String[] args) {
        int [] test = {2, 3, 1, 5};
        int [] test2 = {2, 3, 1, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 4};
        System.out.println(solution(test));
        System.out.println(solution(test2));
    }
}
