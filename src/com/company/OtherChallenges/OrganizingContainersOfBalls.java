package com.company.OtherChallenges;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class OrganizingContainersOfBalls {

    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {

        HashMap<Integer, Integer> ballTotals = new HashMap<>();
        List<Integer> containerSizes = new ArrayList<>();

        for (int i = 0; i < container.size(); i++) {
            int containerTotal = 0;
            for (int j = 0; j < container.get(i).size(); j++) {
                containerTotal += container.get(i).get(j); //adds together the total ints for the container size

                Integer ballTypeCount = container.get(i).get(j); //J is the type of ball starting at 0
                if (!ballTotals.containsKey(j)) { //If j is already a key in the hash map
                    ballTotals.put(j, ballTypeCount); //add the key value j and the actual value of the j position
                } else {
                    ballTotals.put(j, ballTotals.get(j) + ballTypeCount); //Add to the value what is stored in j position of the array
                }
            }
                containerSizes.add(containerTotal);
        }

        for (Integer containerSize : containerSizes) {
            if (!ballTotals.containsValue(containerSize)) {
                System.out.println("HashMap => " + "\n" + ballTotals);
                System.out.println("Container Size => " + "\n" + containerSize);
                System.out.println("Impossible");
                return "Impossible";
            }
        }

        System.out.println("HashMap => " + "\n" + ballTotals);
        System.out.println("Possible");
        return "Possible";
    }


       /* Sample Case 1
       2
        2
        1 1 = 1 of type 0, and 1 of type 1
        1 1 = 1 of type 0, and 1 of type 1


        container 1 size = 2
        container 2 size = 2

        This is possible

        2
        0 2 = 0 of type 0, and 2 of type 1
        1 1 = 1 of type 0, and 1 of type 1

        container 1 size = 2
        container 2 size = 2

        This is impossible.
        */

        /*Sample Case 2
            3
            1 3 1 = 1 of type 0, 3 of type 1, 1 of type 2
            2 1 2 = 2 of type 0, 1 of type 1, 2 of type 2
            3 3 3 = 3 of type 0, 3 of type 1, 3 of type 2

            type 0 total = 6
            type 1 total = 7
            type 2 total = 6

            container 1 size = 5
            container 2 size = 5
            container 3 size = 9

            This is impossible

            3
            0 2 1 = 0 of type 0, 2 of type 1, 1 of type 2
            1 1 1 = 1 of type 0, 1 of type 1, 1 of type 2
            2 0 0 = 2 of type 0, 0 of type 1, 0 of type 2

            type 0 total = 3
            type 1 total = 3
            type 2 total = 2

            container 1 size = 3
            container 2 size = 3
            container 3 size = 2

            This is possible
        * */
    }