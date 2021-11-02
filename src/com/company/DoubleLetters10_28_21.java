package com.company;

public class DoubleLetters10_28_21 {

    public static boolean doubleLetters(String word) {
        boolean isDouble = false;
        String[] arr = word.split("");

        for (int i = 0; i < arr.length; i++) {
            if (isDouble == true) {
                break;
            } else if(i == arr.length - 1 && isDouble == false){
                break;
            }
            else if (arr[i].equalsIgnoreCase(arr[i + 1])){
                isDouble = true;
            }
        }
        System.out.println(isDouble);
        return isDouble;
    }


    public static void main(String[] args) {
        doubleLetters("loop");
        doubleLetters("orange");
    }

}
