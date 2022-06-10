package com.company.ThirtyDaysOfCode;

/*Notes
* Create a method that prints all of the generic array stuff on a new line.
* Do not return. Void
* Receive a generic array?*/

public class Day21 {

    public <E> void printArray(E[] arr){
        for (E item : arr
             ) {
            System.out.println(item);
        }
    }
}
