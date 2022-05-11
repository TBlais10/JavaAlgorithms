package com.company.ThirtyDaysOfCode;

/*NOTES FOR ALGORITHM
 *
 * Challenge is asking us to write a calculator class that takes in two numbers and expects to return n to the p power
 * Asks for a try catch block if any of the numbers are negative.
 * class is not to be public
 *
 * ---
 *
 * Trick question:
 * Try catch requires another return outside of itself. Would always fail because it requires an int.
 *
 * throws exception on a class will save it from being an issue and preventing the need for a try catch in this case.*/

public class Day17 {

    class Calculator {
        public int power(int n, int p) throws Exception {

            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            } else {
                return (int) Math.pow(n, p);
            }
        }
    }

}
