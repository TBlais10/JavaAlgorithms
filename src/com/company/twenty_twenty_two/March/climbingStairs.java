package com.company.twenty_twenty_two.March;

//return the possible number of combinations of climbing stairs 1 and/or 2 times.

/*Ideas for solution
* counts can be in the millions for solution
* while loop? While number is not less than or equal to 0?
* Int outside loop that resets n = the test number
* Count outside the loop to keep track of total solutions.
*
* combinations to count:
* 1. 1
* 2. 2
* 3. 1, 2
* 4. 2, 1
*
* ...too many combinations to hard code.
* List with the values?
* Factorial? NO
*
*
* have totals for different combos and then add to count?
* switch cases?
*
* recursion? using the solution call again and again?*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class climbingStairs {

    static int solution(int n) {
        int[] fib = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;

        int answer = 2;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            answer +=fib[i];
        }

        System.out.println(Arrays.toString(fib));
        return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution(4)); //should be 5
        System.out.println(solution(17)); // should be 2584
    }

}
