package com.company.HackerRankAlgorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        Set split1 = new HashSet(Arrays.asList(s1.split("")));
        Set split2 = new HashSet(Arrays.asList(s2.split("")));

        for (Object letter1 : split1) {
            for (Object letter2 : split2 ) {
                if (Objects.equals(letter1, letter2)){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
//        System.out.println(twoStrings("Hello", "World")); //expecting yes
        System.out.println(twoStrings("hi", "world")); //expecting no
    }

}
