package algoexpert.io.arrays;

import java.util.Arrays;

public class P03_SortedSquaredArray {

    // Time O(nlogn) || space O(1)
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        Arrays.sort(array);
        return array;
    }

    // Time O(n) || space O(n)
    public int[] sortedSquaredArray1(int[] array) {
        // Write your code here.
        int[] sortedSquArray = new int[array.length];
        int smallValueIndex = 0;
        int largeValueIndex = array.length - 1;
        for (int i = largeValueIndex; i >= 0; i--) {
            if (Math.abs(array[smallValueIndex]) > Math.abs(array[largeValueIndex])) {
                sortedSquArray[i] = (int) Math.pow(array[smallValueIndex], 2);
                ++smallValueIndex;
            } else {
                sortedSquArray[i] = (int) Math.pow(array[largeValueIndex], 2);
                --largeValueIndex;
            }
        }
        return sortedSquArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P03_SortedSquaredArray().sortedSquaredArray(new int[]{-4, 1, 2, 3, 5, 6, 8, 9})));
        System.out.println(Arrays.toString(new P03_SortedSquaredArray().sortedSquaredArray1(new int[]{-4, 1, 2, 3, 5, 6, 8, 9})));
    }
}
