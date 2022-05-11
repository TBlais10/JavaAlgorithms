package com.company.ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*NOTE ON CHALLENGE
*
* They simply need a string to be returned as an integer and if it cannot, return the message 'Bad String'
*
* parseInt should do it.
* No if statements. This is specifically asking about try catches for Java
* */

public class Day16 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try {
            System.out.println(Integer.parseInt(S));
        } catch (Exception e){
            System.out.println("Bad String");
        }
    }

}
