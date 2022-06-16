package com.company.ThirtyDaysOfCode;

public class Day22 {

    public static int getHeight(Node2 root){
        int countLeft = 0;
        int countRight = 0;

        if (root.left != null){
            countLeft = getHeight(root.left) + 1;
        }

        if (root.right != null){
            countRight = getHeight(root.right) + 1;
        }


        return Math.max(countLeft, countRight);
    }

}
