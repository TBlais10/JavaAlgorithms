package com.company.November.Nov22_21;
//https://edabit.com/challenge/z9ofdqhTYi9tdCj5T
public class NumOfDigits11_22_21 {

    public static int numOfDigits(int num) {
        if (num < 0){
            return Integer.toString(num * -1).length();
        }
       return Integer.toString(num).length();
    }

    public static void main(String[] args) {
        System.out.println(numOfDigits(12345));
        System.out.println(numOfDigits(-12345));

    }
}
