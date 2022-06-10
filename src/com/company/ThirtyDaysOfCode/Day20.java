package com.company.ThirtyDaysOfCode;

/*NOTES
* Bubble sort is involved*/

// TODO: 6/9/2022 Double check work in HackerRank 

import java.util.Arrays;
import java.util.List;

public class Day20 {
    
    static String bubbleSort(List<Integer> arr) {
        int count = 0;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) != i + 1){
                int track = i;
                while (arr.get(i) != i + 1){
                    track++;
                }
                int temp = arr.get(track);
                arr.get(track).equals(arr.get(i));
                arr.get(i).equals(temp);
                count++;
            }
            
        }
        return "Array is sorted in " + count + " swaps. \nFirst Element: " + arr.get(0) + "\nLast Element: " + arr.get(arr.size());
    }

    public static void main(String[] args) {
        System.out.println(bubbleSort(Arrays.asList(4, 3, 2, 1)));
    }
    
}
