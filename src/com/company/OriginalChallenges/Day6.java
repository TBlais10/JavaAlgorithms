package com.company.OriginalChallenges;

import java.util.Scanner;

public class Day6 {

    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();
            scanner.nextLine();


            for (int i = 0; i < num; i++) {
                String input = scanner.nextLine();
                String even = "";
                String odd = "";

            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0){
                    even += input.substring(j, j + 1);
                }
            }
            for (int j = 0; j < input.length(); j++) {
                if (j % 2 != 0){
                    odd += input.substring(j, j + 1);
            }

                }
                System.out.println(even + " " + odd);
            }
        }
    }

}
