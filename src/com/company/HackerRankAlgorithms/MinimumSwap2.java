package com.company.HackerRankAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

/*NOTES FOR ALGORITHM
* We are to sort the array and note how many times it takes to sort
* Need to remove duplicates. Moving only two at a time
* bubble sort? Other sorting methods? How do we sort numerically?
*
*
*
* We are still gonna need two arrays...but for minimum swaps...get the numbers in numerical order by using i + j
*
* its using the index...
*
* Time complexity needs to go down for solutions 10, 11, 12, and 14*/
public class MinimumSwap2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] != i + 1 && arr[j + 1] == i + 1) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19})); //expecting 46

//        System.out.println(minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));  //expecting 3
    }

}
/*for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }*/