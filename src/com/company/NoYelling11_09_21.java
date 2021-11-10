package com.company;

//https://edabit.com/challenge/33tRK98geLPcf73PF
public class NoYelling11_09_21 {

    public static String noYelling(String phrase) {
        int marker = 0; //to be used to track where we find the position in the loop where we find a letter.

        for (int i = phrase.length() - 1; i >= 0; i--) {
                if (!(phrase.charAt(i) == '!') && !(phrase.charAt(i) == '?') && !(phrase.charAt(i) == '.')) {
                    marker = i+2;
                    break;
                }
        }

        System.out.println("Phrase Length - " + phrase.length());
        System.out.println("The Marker - " + marker);
        return phrase.substring(0, marker);
    }


    public static void main(String[] args) {
        System.out.println(noYelling("OH BOY!!! Why did this have to be as hard as it is????????"));
    }

}
