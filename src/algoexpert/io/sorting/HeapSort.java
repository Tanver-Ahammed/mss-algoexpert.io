package algoexpert.io.sorting;

import java.util.Arrays;

public class HeapSort {

    public static int[] heapSort(int[] array) {
        // Write your code here.
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        return array;
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && array[l] > array[largest])
            largest = l;
        if (r < n && array[r] > array[largest])
            largest = r;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, n, largest);
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(heapSort(new int[]{564, 654, 5, 2, 3, 165, 45, 516, 13, 21, 61, 2310, 321, 5})));

    }

}
