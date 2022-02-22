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
     if (l1 == null && l2 == null){
         return l1;
     }

     if (l1 == null){
         return l2;
     }

     if (l2 == null){
         return l1;
     }

     List<Integer> merged = new ArrayList<>();
     ListNode<Integer> t1 = l1;
     ListNode<Integer> t2 = l2;

     while (t1 != null && t2 != null){
         if (t1.value >= t2.value){
             merged.add(t2.value);
             merged.add(t1.value);
         }
     }

        System.out.println(merged);

    return (ListNode<Integer>) merged;
    }

}
