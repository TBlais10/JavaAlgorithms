package com.company.twenty_twenty_two.InterviewPrep.TimeComplexity;

/*
* Find the point in the array that the item divides. left and right are in balance.
* sum the left and right a parts of the array.
* Return the absolute difference of the two diffrent parts
* a - b = c
*
* divide the size of the array by 2? two loops and two variables?
* based on example, the right half of the array will be greater than the left side.
*
*
* range 2 to 100,000
*
* example: scales - the heavier end will raise the lighter end.
*
* if a number in one half of the array is present in the other, ignore it.
* left side has 3 and 1. The right side has 4... 3 + 1 = 4 ... this would leave 3 + 2 on the right side.
*
* find a way to find sums in common with the left and right side.
* do we add the total for the left side and subtract it by a number based on the total?
*
* moving the numbers back and forth.
* inside a loop -> redefine values based on changing P
*
* nested for loop?
*
* */

// TODO: 3/6/2022 Finish solving algorithm/examine solution again 

public class Equilibrium {

    static public int solution (int[] a){
        long left = 0;
        long right = 0;

        for (int i = 0; i < a.length;) {
        left += a[i];
        i++;
            for (int j = i; j < a.length; j++) {
                right += a[j];
            }

            right = 0;
        }

        return (int)(right - left);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 4, 3})); //should return 5
    }
}
