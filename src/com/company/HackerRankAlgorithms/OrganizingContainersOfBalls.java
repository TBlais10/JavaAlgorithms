package com.company.HackerRankAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrganizingContainersOfBalls {
//Challenge url ... https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem?h_r=internal-search

    public static String organizingContainers(List<List<Integer>> container) {
        HashMap<Integer, Integer> ballTotals = new HashMap<>();
        List<Integer> containerSizes = new ArrayList<>();

        for (List<Integer> containers : container) {
            int containerTotal = 0;
            for (int elements = 0; elements < containers.size(); elements++) {
                Integer ballType = containers.get(elements); //elements is the type of ball starting at 0
                containerTotal += ballType; //adds together the total ints for the container size
                if (!ballTotals.containsKey(elements)) { //If elements is already a key in the hash map
                    ballTotals.put(elements, 0); //add the key value elements and the actual value of the elements position
                }
                ballTotals.put(elements, ballTotals.get(elements) + ballType); //Add to the value what is stored in elements position of the array
            }
            containerSizes.add(containerTotal);//adds to the list of Container sizes
        }

        for (Integer containerSize : containerSizes) {
            if (!ballTotals.containsValue(containerSize)) {
                return "Impossible";
            }
        }
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