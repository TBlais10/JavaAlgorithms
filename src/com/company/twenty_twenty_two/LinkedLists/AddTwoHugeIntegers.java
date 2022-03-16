package com.company.twenty_twenty_two.LinkedLists;

import java.util.Arrays;

// TODO: 3/15/2022 Complete algorithm

public class AddTwoHugeIntegers {

    class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    public static ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {

        ListNode<Integer> answer = null;

        StringBuilder listA = new StringBuilder();
        StringBuilder listB = new StringBuilder();

        ListNode<Integer> trav1 = a;
        ListNode<Integer> trav2 = b;

        while (trav1 != null) {
            listA.append(trav1.value);
            trav1 = trav1.next;
        }

        while (trav2 != null) {
            listB.append((trav2.value));
            trav2 = trav2.next;
        }

        System.out.println(listA + "- List A");
        System.out.println(listB + "- List B");

        Integer math = Integer.parseInt(String.valueOf(listA)) + Integer.parseInt(String.valueOf(listB));

        System.out.println(math + "- Math");

        String bigNum = math.toString();

        for (int i = 0; i < bigNum.length(); i += 4) {
            answer.value = Integer.parseInt(bigNum.substring(i, i+4));
            answer = answer.next;
        }

        return answer;

    }

    public static void main(String[] args) {
//        ListNode<Integer> testA =
//                System.out.println(solution());
    }

}
