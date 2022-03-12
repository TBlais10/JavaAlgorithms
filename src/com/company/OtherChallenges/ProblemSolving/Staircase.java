package com.company.OtherChallenges.ProblemSolving;

public class Staircase {

    public static void staircase(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < n; i++) {
            answer.append("\n").append(" ".repeat(n - i)).append("#".repeat(i));
        }

        answer.append("\n").append("#".repeat(n));

        System.out.println(answer);
    }

    public static void main(String[] args) {
        staircase(6);
    }

}
