package com.company.HackerRankAlgorithms.Implementation;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int clouds = 0;

        do {
            clouds = (clouds + k) % c.length;

            if (c[clouds] % 2 != 0) {
                energy -= 2;
            }
            energy--;

        } while (clouds != 0);

        return energy;
    }

    public static void main(String[] args) {
        int[] test = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        System.out.println(jumpingOnClouds(test, 3));
    }

}

/*
 * Given two numbers for the algorithm -
 * 1. The size of the binary array
 * 2. The number of iterations that the 'jumping' will take to do a check.
 *
 * A move of K (the variable for the movement) will always minus 1 from the energy total (which always starts at 100).
 * If there is a 1 there will be an additional subtraction of 2
 *
 * Once the array ends, return to the start of the array and return the energy total
 *
 *
 * */

//10 3
//1 1 1 0 1 1 0 0 0 0
//if i is less than k steps