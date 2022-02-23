package com.company.twenty_twenty_two.LinkedLists;

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

    ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {
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
        ListNode<Integer> t1 = l1;
        ListNode<Integer> t2 = l2;

        while (true) {
            if (t1.value >= t2.value) {
                //add t1
                merged = l1;
                merged.next = solution(l1.next, l2);
            } else {
                //add t2
                merged = l2;
                merged.next = solution(l1, l2.next);
            }
            return merged;
        }

    }

//    public static ListNode<Integer> sort(ListNode<Integer> head){
//        if (head == null || head.next == null){
//            return head;
//        }
//
//        ListNode<Integer>[] array =
//
//        return sort()
//    }

}
