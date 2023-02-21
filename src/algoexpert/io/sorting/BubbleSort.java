package algoexpert.io.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i] > array[j]) {
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{5, 2, 6, 4, 2, 1, 3, 6})));
    }

}
