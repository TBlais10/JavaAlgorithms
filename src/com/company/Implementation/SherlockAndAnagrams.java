package com.company.Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SherlockAndAnagrams {

    public static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> letters = new HashMap<>();

        String[]newString = s.split("");

        int answer = 0;

        System.out.println(Arrays.toString(newString));

        for (String letter : newString) {

            if(!letters.containsKey(letter)){
                letters.put(letter, 0);
            }
            letters.put(letter, letters.get(letter) + 1);
        }



        System.out.println(letters);

        for (String check : letters.keySet()) {
            if (letters.get(check) >= 2){
                answer += letters.get(check);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(sherlockAndAnagrams("abba")); //should be 4
        System.out.println(sherlockAndAnagrams("abcd")); //should be 0
    }

}
