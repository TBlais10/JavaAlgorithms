package com.company.twenty_twenty_two.LinkedLists;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> values = new ArrayList<>();
        ListNode<Integer> traveler = l;

        while (traveler != null) { //Changes l to the last node in the list.
            values.add(traveler.value);
            traveler = traveler.next;
        }

        for (int i = 0; i < values.size() / 2; i++) {
            if (!Objects.equals(values.get(i), values.get(values.size() - 1 - i))){
                return false;
            }
        }

        return true;
    }
}
