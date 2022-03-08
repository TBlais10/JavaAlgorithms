package com.company.twenty_twenty_two.March;

public class HouseRobber {

    /*Robbing a house, every house has money. Can't rob in one night because they have connected security systems.
    Triggers if two adjacent house are broke into on the same night. (Rob every house thru different loops. Every other house)

    In one night, find how much money you can rob. The numbers in the array represents the money to be taken.

    Looking for total of the arrays.
    Ex: [1, 1, 1] -> expected answer is 2.

    There seems to be a pattern of the array starting either on an odd set of arrays or even.

    there are different sets of numbers. -> find the biggest numbers possible to go for. Based on which number is largest, go every other int until that big number is hit
    no sense to sorting the array. needs to keep track of every other element to find the solution...but it helps to find how to start the process.

    could there be two diffrent loops? a negative loop that goes thru the array backwards and one that goes forwards? depends on the position of the highest num?
    check the total of both even and odd loops?
    * */

    static int solution(int[] nums) {
        int answer = 0;
        int largestNum = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNum){
                largestNum = nums[i];
                index = i;
            }
        }

        if (index == index % 2){
            for (int i = 0; i < nums.length; i += 2) {
                answer += nums[i];
            }
        } else {
            for (int i = 1; i < nums.length; i+=2) {
                answer += nums[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] test = {2, 1, 1, 1}; //Expecting 3 -> needs to loop thru on Even elements
        int[] test2 = {1, 2, 1, 1}; //Expecting 3 -> needs to loop thru on Odd elements
        System.out.println(solution(test));
        System.out.println(solution(test2));
    }

}
