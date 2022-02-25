package com.company.LinkedLists;

public class LinkedList {

    public static void main(String[] args) {
        Node<Integer> head = null;
        head = recAddNode(head, 2);
        head = recAddNode(head, 8);
        head = recAddNode(head, 5);
        head = recAddNode(head, 9);

        displayList(head);

//        assertResult(head.value == 4);
//        assertResult(head.next.value == 2);
//        assertResult(head.next.next.value == 8);
//        assertResult(head.next.next.next.value == 5);
//        assertResult(head.next.next.next.next.value == 9);
//
//        System.out.println(find(head, 4));
//        System.out.println(find(head, 8));
//        System.out.println(find(head, 5));
//        System.out.println(find(head, 10));
    }

    public static Node<Integer> addNode(Node<Integer> head, int value) {
        Node<Integer> newNode = new Node<>(value);
        if (head == null) {
            return newNode;
        }

        Node<Integer> trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = newNode;
        return head;
    }

    public static Node<Integer> recAddNode(Node<Integer> head, int value){
        //get to the last node
        if (head != null){
            return new Node<Integer>(value);
        }
        head.next = recAddNode(head.next, value);
        return head;
    }

    public static Node<Integer> find(Node<Integer> head, int query) {
        // return the node that contains the query. If not found, return null
        Node<Integer> trav = head;
        while (trav != null && trav.value != query){
            trav = trav.next;
        }
        return trav;
    }

    public static void displayList(Node<Integer> head) {
        /// output should be 2859 additional challenge 2, 8, 5, 9
        Node<Integer> trav = head;
        StringBuilder output = new StringBuilder();
        while (trav != null) {
            output.append(trav.value);
//            System.out.print(trav.value);
            if (trav.next != null) {
                output.append(", ");
            }
            trav = trav.next;
        }
        System.out.println(output);
    }

    public static void remove(Node<Integer> head, int query) {
        if (head.value == query) {
            head = head.next;
            return;
        }
        Node<Integer> trav = head;
        while (trav.next != null &&trav.next.value != query){
            trav = trav.next;
            }
        trav.next = trav.next.next;
        }

    public static void assertResult(boolean result) {
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("N0");
        }
    }

}
