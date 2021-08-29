package com.company;
import java.util.*;

public class Day8 {
    //Complete this code or write your own from scratch

    class Solution{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            Map<String, Integer> contacts = new HashMap<>();
            int n = in.nextInt();

            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                contacts.put(name, phone);
            }
            while(in.hasNext()){
                String s = in.next();
                Integer checkContacts = contacts.get(s);

                if(checkContacts == null){
                    System.out.println("Not found");
                } else {
                    System.out.println(s + "=" + checkContacts);
                }
            }
            in.close();
        }
    }
}
