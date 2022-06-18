package com.company.ThirtyDaysOfCode;

import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
    static void levelOrder(Node2 root) {
        Queue<Node2> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node2 trav = queue.remove();
            System.out.print(trav.data + " ");

            if (trav.left != null) {
                queue.add(trav.left);
            }
            if (trav.right != null) {
                queue.add(trav.right);
            }
        }
    }
}
