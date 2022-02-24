package com.company.twenty_twenty_two.LinkedLists;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class mergeTwoLinkedLists {

    //     Singly-linked lists are already defined with this interface:
    class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    public ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {
        if (l1 == null && l2 == null) {
            return l1;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode<Integer> merged = null;

        if (l1.value >= l2.value) {
            //add t2 if less than t1;
            merged = l2;
            merged.next = solution(l1, l2.next);
        } else {
            //add t1 if less than t2
            merged = l1;
            merged.next = solution(l1.next, l2);
        }

        return merged;

    }


}

/* working on a solution that would avoid a stack overflow

        if (l1 == null && l2 == null) {
            return l1;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode<Integer> merged = null;
        ListNode<Integer> traveler = merged;

        while(l1 != null || l2 != null){
        if (l1.value >= l2.value) {
            //add t2 if less than t1merged = t2;
            merged = l2;
            l2 = l2.next;
//            merged.next = solution(l1, l2.next);
        } else {
            //add t1 if less than t2
            merged = l1;
            l1 = l1.next;
//            merged.next = solution(l1.next, l2);
        }
            merged = merged.next;
        }

        return traveler;*/
