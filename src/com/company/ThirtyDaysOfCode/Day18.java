package com.company.ThirtyDaysOfCode;

//https://www.hackerrank.com/challenges/30-queues-stacks/problem?isFullScreen=true
/*NOTES ON SOLVING ALGORITHM
* Main method has a lot of methods expected from this solution (in the algorithm page)
* Need: - pushCharacter(c), popCharacter(), enqueueCharacter(e), and dequeueCharacter()
* Will be using characters
*
* pushChar and enqueChar will be the final comparitors for checking if the algorithm works
*
* Methods will be built in the solution(Day18 class)
*
* Stack - first in last out
* Queue - first in first out
*
* */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18 {

    public Stack<Character> stack = new Stack<>();
    public Queue<Character> queue = new LinkedList<>();

    public void pushCharacter(char c){
        stack.push(c);
    }

    public void enqueueCharacter(char c){
        queue.add(c);
    }

    public Character popCharacter(){
        return stack.pop();
    }

    public Character dequeueCharacter(){
        return queue.remove();
    }


    public static void main(String[] args) {

    }

}
