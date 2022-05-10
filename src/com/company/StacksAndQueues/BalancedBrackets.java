package com.company.StacksAndQueues;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class BalancedBrackets {

    // TODO: 2/1/2022 GET CLASS SOLUTION AND EXAMINE CODE

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     *
     * Returning thoughts on solving algorithm...
     *
     * the list should be an even sized string...if not it fails instantly
     * check for half of the string. If it matches that position of the string then continue. if not, fail it.
     */

    public static String isBalanced(String s) {
        HashMap<Character, Character> reference = new HashMap<>();
        reference.put('{', '}');
        reference.put('(', ')');
        reference.put('[', ']');

        Deque<Character> stack = new LinkedList<>();

        for (Character bracket : s.toCharArray()) {
            if (reference.containsKey(bracket)){
                stack.push(bracket);
            } else if (!bracket.equals(reference.get(stack.poll()))){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[(])}")); //Should return NO
//        System.out.println(isBalanced("{[()]}")); //Should return YES
//        System.out.println(isBalanced("{{[[(())]]}}"));//should return YES

//        System.out.println(isBalanced("{(([])[])[]}")); //should return YES

//        System.out.println(isBalanced("{(([)[])[]]}")); //should return NO
//
//        System.out.println(isBalanced("{(([])[])[]}[]")); //should return YES


    }

}