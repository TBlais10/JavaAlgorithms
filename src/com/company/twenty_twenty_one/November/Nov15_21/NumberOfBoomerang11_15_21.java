package com.company.twenty_twenty_one.November.Nov15_21;

import java.util.ArrayList;
import java.util.Arrays;

//https://edabit.com/challenge/b7iHQDw72zzkmgCun
public class NumberOfBoomerang11_15_21 {

    //if !arr.length %3 ... if arr.length is not divisible by 3.
    //if i == i + 1, dont count.
    //if i == i + 2
    public static int countBoomerangs(int[] arr) {

        ArrayList<int[]> allBoomerangs = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            int[] boomerang = new int[3];
            if (arr[i] == arr[i + 2] && !(arr[i] == arr[i + 1])) {
                boomerang[0] = arr[i];
                boomerang[1] = arr[i + 1];
                boomerang[2] = arr[i + 2];
                allBoomerangs.add(boomerang);
            }
        }

//        if (arr.length != arr.length % 3) {
//            for (int i = arr.length - 1; i >= 2; i--) {
//                int[] boomerang = new int[3];
//                if (arr[i] == arr[i - 2] && !(arr[i] == arr[i - 1])) {
//                    boomerang[0] = arr[i];
//                    boomerang[1] = arr[i - 1];
//                    boomerang[2] = arr[i - 2];
//                    allBoomerangs.add(boomerang);
//                }
//            }
//
//        }
        for (int[] boomberang : allBoomerangs) {
            System.out.print(Arrays.toString(boomberang) + " - ");
        }
        return allBoomerangs.size();
    }

    public static void main(String[] args) {

        System.out.println(countBoomerangs(new int[]{9, 5, 9, 5, 1, 1, 1}));
    }
}
