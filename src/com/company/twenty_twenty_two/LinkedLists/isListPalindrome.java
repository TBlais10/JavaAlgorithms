package com.company.twenty_twenty_two.LinkedLists;

public class isListPalindrome {

    // Singly-linked lists are already defined with this interface:
 class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }
//
    boolean solution(ListNode<Integer> l) {
        ListNode<Integer> traveler = l;
        int count = 0;

        while (l != null){
            count++;
        }

        while (traveler.next != null){
            traveler = traveler.next;
        }




     return true;
    }


}
