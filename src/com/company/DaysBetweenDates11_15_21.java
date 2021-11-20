package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

//https://edabit.com/challenge/3hdXjfJozQySRC3gE
public class DaysBetweenDates11_15_21 {

    public static int getDays(String date1, String date2){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm dd, yyyy");
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);

        return (int) ChronoUnit.DAYS.between(firstDate, secondDate);
    }


    public static void main(String[] args) {
        System.out.println(getDays("June 14, 2019", "June 20, 2019"));
        System.out.println(getDays("December 29, 2019", "January 1, 2020"));
    }

}