package com.company.OtherChallenges;
// https://www.hackerrank.com/challenges/utopian-tree/problem

public class UtopianTree {

    public static int utopianTree(int n) {
        int answer = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                answer += 1;
            } else {
                answer *= 2;
            }
            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(5)); // expecting 14
    }

}
