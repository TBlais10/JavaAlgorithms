package com.company.OtherChallenges.Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Birds {
    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> birdTypes = new HashMap<>();
        int answer = 0;

        for (Integer birds : arr) {
            if (!birdTypes.containsKey(birds)) {
                birdTypes.put(birds, 0);
            }
            birdTypes.put(birds, birdTypes.get(birds) + 1);
        }

        for (Integer bird : birdTypes.keySet()){
            if (!(answer > birdTypes.get(bird))){
                answer = birdTypes.get(bird);
            }
        }

        for (Integer key : birdTypes.keySet()){
            if (answer == birdTypes.get(key)){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
    }

}
