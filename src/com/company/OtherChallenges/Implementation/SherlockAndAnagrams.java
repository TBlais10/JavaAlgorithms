package com.company.OtherChallenges.Implementation;

import java.util.Arrays;
import java.util.HashMap;

//frequency map

/*Checking for the same characters with in a range no matter what the order is.
* Sort that segment into sequential order and compare.
* List of arrays? find gropus that work and put them into a list?????*/

// TODO: 3/21/2022 Finish

public class SherlockAndAnagrams {

    public static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> letters = new HashMap<>();

        String[]newString = s.split("");

        int answer = 0;

//        System.out.println(Arrays.toString(newString));

        for (String letter : newString) {

            if(!letters.containsKey(letter)){
                letters.put(letter, 0);
            }
            letters.put(letter, letters.get(letter) + 1);
        }

//        System.out.println(letters);

        for (String check : letters.keySet()) {
            if (letters.get(check) > 1){
                answer += letters.get(check);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(sherlockAndAnagrams("abba")); //should be 4
//        System.out.println(sherlockAndAnagrams("abcd")); //should be 0

//        System.out.println(sherlockAndAnagrams("cdcd")); //should be 5

//        System.out.println(sherlockAndAnagrams("ifailuhkqq")); //should be 3
//        System.out.println(sherlockAndAnagrams("kkkk")); // should be 10
    }

}
