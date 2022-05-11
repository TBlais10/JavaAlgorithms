package com.company.OtherChallenges.ProblemSolving;

public class TimeConversion {

    public static String timeConversion(String s) {
        String format = s.substring(s.length()-2);
        int hour = Integer.parseInt(s.substring(0,2));
        String remainder = s.substring(2, s.length() - 2);

        if (format.equalsIgnoreCase("pm") && hour != 12){
            return (hour + 12) + remainder;
        } else if (format.equalsIgnoreCase("am") && hour == 12){
            return "00" + remainder;
        } else {
            return s.substring(0, s.length() -2);
        }

    }


    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:00AM"));
    }

}
