package com.company.November.Nov09_21;

//https://edabit.com/challenge/9X8zLpBEcQsyerPgL
public class HighestDigit11_09_21 {

    public static int highestDigit(int n) {
        String numToString = Integer.toString(n);
        int[] arr = new int[numToString.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = numToString.charAt(i) - '0';
        }
//        System.out.println(Arrays.toString(arr));

        int hightestNum = 0;
        for (int j : arr) {
            if (j > hightestNum) {
                hightestNum = j;
            }
        }

        return hightestNum;
    }

    public static void main(String[] args) {
        System.out.println(highestDigit(12345));
    }

}
