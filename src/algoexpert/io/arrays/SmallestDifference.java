package algoexpert.io.arrays;

import java.util.Arrays;

public class SmallestDifference {

    // Time O(n^2) || space O(2)
    public static int[] smallestDifference1(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        int smallestDifference = Integer.MAX_VALUE;
        int[] smallDiffArr = new int[2];
        for (int valueOne : arrayOne) {
            for (int valueTwo : arrayTwo) {
                int difference = Math.abs(valueOne - valueTwo);
                if (difference < smallestDifference) {
                    smallDiffArr = new int[]{valueOne, valueTwo};
                    smallestDifference = difference;
                }
            }
        }
        return smallDiffArr;
    }

    // Time O(nlog(m) + mlog(n)) || space O(2)
    public static int[] smallestDifference2(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int smallestDifference = Integer.MAX_VALUE;
        int[] smallDiffArr = new int[2];
        int indexOne = 0;
        int indexTwo = 0;
        while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
            int valueOne = arrayOne[indexOne];
            int valueTwo = arrayTwo[indexTwo];
            int difference = Math.abs(valueOne - valueTwo);
            if (difference < smallestDifference) {
                smallDiffArr = new int[]{valueOne, valueTwo};
                smallestDifference = difference;
            }
            if (valueOne < valueTwo)
                indexOne++;
            else
                indexTwo++;
        }
        return smallDiffArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallestDifference1(new int[]{-1, 5, 10, 20, 28, 3},
                new int[]{26, 134, 135, 15, 17})));
        System.out.println();
        System.out.println(Arrays.toString(smallestDifference2(new int[]{-1, 5, 10, 20, 28, 3},
                new int[]{26, 134, 135, 15, 17})));
    }
}
