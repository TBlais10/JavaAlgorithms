package com.company.twenty_twenty_one.October.Oct28_21;
//https://edabit.com/challenge/WM5s7vuHnXdcKCEjS

import java.util.Arrays;

public class SortNumbers10_28_21 {

    public static int[] sortNumsAscending(int[] nums) {
        if (nums == null || nums.length == 0){
            return new int[0];
        }
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {
        int[] test = {80, 29, 4, -95, -24, 85};
        test = null;
        test = new int[0];
        System.out.println(Arrays.toString(sortNumsAscending(test)));
    }

}
