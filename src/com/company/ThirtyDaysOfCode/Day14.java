package com.company.ThirtyDaysOfCode;

/*THOUGHTS ON ALGORITHM
* Need to find the maximum difference between the range that is provided by the test cases
* Get the first and last elements of the array and do math
*
* Assume they are sorted as they are given...if not add a sort
*
* answer needs to be stored in the maximum difference variable.
*
* Array methods that look at first and last elements? Basic array not a list/collection*/

import java.util.Arrays;

public class Day14 {

    class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference(int[] elements) {
            this.elements = elements;
        }

        public void computeDifference(){
            Arrays.sort(elements);
            maximumDifference = elements[elements.length - 1] - elements[0];
        }

    }

    public static void main(String[] args) {

    }

}
