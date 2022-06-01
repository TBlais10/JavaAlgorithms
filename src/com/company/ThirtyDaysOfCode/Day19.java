package com.company.ThirtyDaysOfCode;

/*Goal
* Finish the method that returns all divisible numbers of the given argument. and present their sum*/

public class Day19 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
