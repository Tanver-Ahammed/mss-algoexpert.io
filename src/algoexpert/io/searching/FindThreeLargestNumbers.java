package algoexpert.io.searching;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    // Time O(n) || space O(1) using recursion
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        int thirdLargestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargestNumber) {
                thirdLargestNumber = secondLargestNumber;
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = array[i];
            } else if (array[i] > secondLargestNumber) {
                thirdLargestNumber = secondLargestNumber;
                secondLargestNumber = array[i];
            } else if (array[i] > thirdLargestNumber)
                thirdLargestNumber = array[i];
        }
        return new int[]{thirdLargestNumber, secondLargestNumber, firstLargestNumber};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.
                toString(findThreeLargestNumbers(new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7})));
    }

}
