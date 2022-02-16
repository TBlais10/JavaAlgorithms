package com.company.twenty_twenty_one.November.Nov15_21;

//https://edabit.com/challenge/GBKphScsmDi9ek3ra
public class HowManyVowels11_15_21 {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        String[] vowels = {"a", "e", "i", "o", "u"};

        String[] newString = str.split("");

        for (String letter : newString) {
            for (String vowel : vowels) {
                if (letter.equalsIgnoreCase(vowel)) {
                    vowelsCount++;
                }
            }
        }

        return vowelsCount;

    }

    public static void main(String[] args) {

    }
}