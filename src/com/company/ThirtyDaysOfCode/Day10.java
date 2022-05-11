package com.company.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day10 {

    public class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine().trim());

            String[] binaryNum = Integer.toBinaryString(n).split("0");

            int constCount = 0;

            for (String group : binaryNum) {
                if (constCount < group.length()) {
                    constCount = group.length();
                }
            }

            System.out.println(constCount);

            scanner.close();
        }
    }

}

/*
for each approach
            String binary = Integer.toBinaryString(n);
            int largestCount = 0;

            for (char digit : binary.toCharArray()) {
                constCount++;
                if (digit == '0') {
                    constCount = 0;
                } else if (constCount > largestCount) {
                    largestCount = constCount;
                }
            }

            if (constCount > largestCount) {
                largestCount = constCount;
            }

Many languages have built-in functions for converting numbers from decimal to binary. To convert an integer, , from decimal to a String of binary numbers in Java, you can use the Integer.toBinaryString(n) function.*/