package com.company.twenty_twenty_one.October.Oct26_21;
//https://edabit.com/challenge/9D39q2q9yAFCDM9da

public class VideoLength10_26_21 {

    public static int minutesToSeconds(String tm) {
        String[] removeSymbol = tm.split(":");
        int[] arr = new int[removeSymbol.length];
        int seconds = 0;

        for (int i = 0; i < removeSymbol.length; i++) {
            arr[i] = Integer.parseInt(removeSymbol[i]);
        }
        if (arr[1] >= 60) {
            return -1;
        } else {
            seconds = arr[0] * 60 + arr[1];
        }

//        System.out.println(Arrays.toString(removeSymbol));
//        System.out.println(Arrays.toString(arr));
//        System.out.println(seconds);

        return seconds;
    }

}
