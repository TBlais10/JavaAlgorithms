package com.company.October.Oct28_21;

public class DifferenceOfMinAndMax10_28_21 {

    public static int differenceMaxMin(int[] arr) {
        int smallestNum = 1;
        int largestNum = 1;

        for (int num: arr) {
            if (num < smallestNum){
                smallestNum = num;
            }
            else if (num > largestNum){
                largestNum = num;
            }
        }


        if (smallestNum < 0){
            smallestNum *= -1;
            return smallestNum + largestNum;
        }

        //System.out.println(smallestNum + "\n" + largestNum);
        return largestNum - smallestNum;
    }

    public static void main(String[] args) {
//        differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91});
        System.out.println(differenceMaxMin(new int[]{-70, 43, 34, 54, 22}));
    }

}
