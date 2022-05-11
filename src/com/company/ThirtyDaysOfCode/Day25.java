package com.company.ThirtyDaysOfCode;

//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem?isFullScreen=true

/* NOTES ON ALGORITHM
With 0 TIME COMPLEXITY

n/2 OR SquareRoot

* */

public class Day25 {

//        BigInteger bigInt = BigInteger.valueOf(n);
//        return bigInt.isProbablePrime(100) ? "Prime" : "Not Prime";
//        System.out.println(bigInt.isProbablePrime(100));
    public static String isPrimeNum(int n) {
        if (n % Math.sqrt(n) == 0 || n == 1){
            return "Not Prime";
        }
        if(n == 2){
            return "Prime";
        }

        String answer = "";
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                answer = "Not Prime";
            } else {
                answer = "Prime";
            }
        }
       return answer;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNum(2) + " -> 2"); //should be not prime
        System.out.println(isPrimeNum(5) + " -> 5"); //should be prime
        System.out.println(isPrimeNum(361) + " -> 361"); //should be not prime
    }
}
