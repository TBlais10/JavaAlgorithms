package com.company.twenty_twenty_two.LinkedLists;

import java.util.LinkedList;

public class removeKFromList {

    //     Singly-linked lists are already defined with this interface:
    class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    ListNode<Integer> solution(ListNode<Integer> l, int k) {
        while (l != null && l.value == k) {
                l = l.next;
        }

        ListNode<Integer> traveler = l;

        while (traveler != null && traveler.next != null){
            if (traveler.next.value == k){
                traveler.next = traveler.next.next;
            } else {
                traveler = traveler.next;
            }
        }

        return l;
    }

}

/*l: [3, 1, 2, 3, 4, 5]
k: 3
Expected Output:
[1, 2, 4, 5]*/