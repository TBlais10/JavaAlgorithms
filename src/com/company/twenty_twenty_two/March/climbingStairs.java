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

public class climbingStairs {

    static int solution(int n) {
        if (n == 1 || n == 2){
            return n;
        }

        int answer = 0;


        return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution(34));
    }

}
