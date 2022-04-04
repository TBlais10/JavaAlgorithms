package com.company.OriginalChallenges;

public class Day15 {


    public static Node insert(Node head, int data) {
        if (head == null){
            return new Node(data);
        }
        head.next = insert(head.next, data);

        return head;
    }

}
