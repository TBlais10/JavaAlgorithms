package com.company.October.Oct26_21;
//https://edabit.com/challenge/tiyPFonvAJ8e6H9jS

public class ReverseNumber10_26_21 {

    public static String rev(int n) {
        int newNumber = 0;
        String answer = "";

        if (n < 0){
            n *= -1;
        }

        while (n != 0){
            int d = n % 10;
            newNumber = newNumber * 10 + d;
            n /= 10;
            //System.out.println(n);
        }

        answer += newNumber;

        //System.out.println(newNumber);
        //System.out.println(answer +  " The string");

        return answer;
    }

}
