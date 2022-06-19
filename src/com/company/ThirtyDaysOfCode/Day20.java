package com.company.ThirtyDaysOfCode;

/*NOTES
* Bubble sort is involved*/

import java.util.Arrays;
import java.util.List;

public class Day20 {
    
    static String bubbleSort(List<Integer> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() - 1; j++) {
                if (a.get(j) > a.get(j + 1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    count++;
                }
            }
            if (count == 0) break;
        }

        return "Array is sorted in " + count + " swaps. \nFirst Element: " + a.get(0) + "\nLast Element: " + a.get(a.size() -1 );
    }

    public static void main(String[] args) {
        System.out.println(bubbleSort(Arrays.asList(4, 3, 2, 1)));
    }
    
}
