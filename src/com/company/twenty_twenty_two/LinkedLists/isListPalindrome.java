package com.company.twenty_twenty_two.LinkedLists;

import java.util.List;
import java.util.Objects;

public class isListPalindrome {

    // Singly-linked lists are already defined with this interface:
    class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    boolean solution(ListNode<Integer> l) {
        if (l == null) {
            return true;
        }

        ListNode<Integer> traveler = l;
        int count = 0;


        while (traveler.next != null) { //Changes l to the last node in the list.
            count++;
            traveler = traveler.next;
        }

        if (!Objects.equals(l.value, traveler.value)) {
            return false;
        }

        return true;
    }


}
