package com.company.twenty_twenty_one.November.Nov1_21;
//https://edabit.com/challenge/rzpucPyoyEtXPo2BG

public class ArrayOfMultiples11_01_21 {

    public static int[] arrayOfMultiples(int num, int length) {
        int[] newArr = new int[length];
        for(int i = 0; i < newArr.length; i++){
            if(i == 0){
                newArr[i] = num;
            } else {
                newArr[i] += newArr[i -1] + num;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        arrayOfMultiples(7,5);
    }


}
