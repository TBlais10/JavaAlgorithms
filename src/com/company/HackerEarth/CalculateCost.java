package com.company.HackerEarth;

/*NOTES ON ALGORITHM
* Input is x, k, price int[], and N
*
* N is the number of items
* K is the most distinct price
* X is the remainder of the price needing to be paid...the price you cannot remember
* price int is N split...the prices of N items?
*
*
* Need to return the cost for the prices I don't remember
*
* Based on this text case, I can remember 1, 2, and 3 for prices
*
* can only remember 2 prices that I need to pay 5 for one price to remember
*
* Do i need to multiply the price and divide it by the number of items? I might have already tried that.
*
*Algorithm post interview...
*  */

import java.util.*;

public class CalculateCost {
    public static long getCost(long N, long k, long[] price, long X){
        Set<Long> set = new HashSet<>();
        for (long num : price) {
            set.add(num);
        }

        return (N - set.size()) * X;
    }

    public static void main(String[] args) {
        long[] test = {1, 2, 3, 1};

        System.out.println(getCost(4, 2,test , 5)); //expecting 5;
    }
}

/*You had to add the ones that were not duplicates
*Hash map!
*
* set is better.
* Add every element to it, get the length, minuts the number of unique values, multiply it by the penalty*/

/*long total = 0;
        long totalB = 0;
        for (int i = 0; i < price.length; i++) {
            if (i <= k){
                total += price[i];
            } else {
                totalB += price[i];
            }
//            System.out.println(price[i]);
            return total - totalB;
        }*/
