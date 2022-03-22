package com.company.OriginalChallenges;

import java.util.Arrays;

public class Day12 {
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */

    /*NOTES ON SOLUTION
     * What we need to return:
     * A print statement from a student that has their last name first and their first name last,
     * then a separate line their id number starting with ID: 1234,
     * Then their Grade by letter -> Grade: O
     *
     * given x number of test cases, get the sum, divide by x, then compare against the table to produce the result.
     * Arrays.stream can be used to gather the sum of an array.
     *  */

    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    static class Student extends Person {
        private int[] testScores;

        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public char calculate() {
            int total = Arrays.stream(testScores).sum() / testScores.length;

            return (total > 89 ? 'O' : total > 79 ? 'E' : total > 69? 'A' : total > 54 ? 'P' : total > 39 ? 'D' : 'T');
            }
        }

    }

//            int total = 0;
//    for (int score : testScores) {
//            total += score;
//            }
//            total /= testScores.length;
/*if (total >= 90) {
                return 'O';
            } else if (total >= 80) {
                return 'E';
            } else if (total >= 70) {
                return 'A';
            } else if (total >= 55) {
                return 'P';
            } else if (total >= 40) {
                return 'D';
            }
                return 'T';*/


