package com.company.ThirtyDaysOfCode;

//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem?isFullScreen=true

/* NOTES ON CHALLENGE
Asked to go thru a linked list and remove duplicate numbers.

take the nodes and add to list? parse out that way?

have a condition that checks if node.next != null. Avoid null pointer exception

will we have orphans? broken up nodes?

*
* */

public class Day24 {

    public static Node removeDuplicates(Node head) {
        Node trav = head;

        while (trav != null && trav.next != null) {
            if (trav.data == trav.next.data){
                trav.next = trav.next.next;
            } else {
              trav = trav.next;
            }
        }

        return head;

    }

        /* 1
            2
            2
            3
            3
            4*/

}
