package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10 {

    public class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine().trim());
//            String binaryNum = "";

//            while(n > 0) {
//                int remainder = n % 2;
//                n = n/2;
//                binaryNum += remainder;
//            }

            String binaryNum = Integer.toBinaryString(n);

            System.out.println(binaryNum);

            int constCount = 0;

            for (int i = 0; i <binaryNum.length(); i++) {
                if (i != 0){
                    constCount++;
                }
                else{
                    constCount = 0;
                }
            }

            scanner.close();
        }
    }

}

/*


Many languages have built-in functions for converting numbers from decimal to binary. To convert an integer, , from decimal to a String of binary numbers in Java, you can use the Integer.toBinaryString(n) function.*/