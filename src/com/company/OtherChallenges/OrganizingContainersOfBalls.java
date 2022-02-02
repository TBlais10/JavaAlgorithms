package com.company.OtherChallenges;

import java.io.*;
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
        List<Integer> containerSizes = null;

        for (int i = 0; i < container.size(); i++) {
            containerSizes.add(container.get(i).size());

            for (int j = 0; j < container.get(i).size(); j++) {
                int ballTypeCount = container.get(i).get(j); //J is the type of ball starting at 0
                if (ballTotals.containsKey(j)) { //If j is already a key in the hash map
                    ballTotals.put(j, ballTotals.get(j) + ballTypeCount); //Add to the value what is stored in j position of the array
                }
                ballTotals.put(j, ballTypeCount); //add the key value j and the actual value of the j position
            }
        }

        for (Integer containerSize : containerSizes) {
            if (!ballTotals.containsValue(containerSize)) {
                return "Impossible";
            }
        }

        return "Possible";
    }

    public static void main(String[] args) {

//        System.out.println(organizingContainers([[1,1], [1,1]]));

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
            type 3 total = 6

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

}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<List<Integer>> container = new ArrayList<>();
//
//                IntStream.range(0, n).forEach(i -> {
//                    try {
//                        container.add(
//                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                        .map(Integer::parseInt)
//                                        .collect(toList())
//                        );
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                });
//
//                String result = Result.organizingContainers(container);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

//}
