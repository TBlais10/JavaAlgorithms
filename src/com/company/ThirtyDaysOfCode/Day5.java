package com.company.ThirtyDaysOfCode;

import java.io.*;
import java.util.Scanner;

public class Day5 {

    public class Solution {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                int answer = n * i;
                System.out.println(n + " x " + i + " = " + answer);

                scanner.close();
            }
        }
    }
}