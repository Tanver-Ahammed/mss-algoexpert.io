package algoexpert.io.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] array) {
        // Write your code here.
        mergeSortMethod(array, 0, array.length - 1);
        return array;
    }

    private static void mergeSortMethod(int[] array, int left, int right) {
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;
        mergeSortMethod(array, left, mid);
        mergeSortMethod(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {

        int leftIndex = mid - left + 1;
        int rightIndex = right - mid;

        int[] leftArray = new int[leftIndex];
        int[] rightArray = new int[rightIndex];

        for (int i = 0; i < leftIndex; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < rightIndex; ++j)
            rightArray[j] = array[mid + 1 + j];

        int i = 0, j = 0;
        int index = left;
        while (i < leftIndex && j < rightIndex) {
            if (leftArray[i] <= rightArray[j]) {
                array[index] = leftArray[i];
                i++;
            } else {
                array[index] = rightArray[j];
                j++;
            }
            index++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftIndex) {
            array[index] = leftArray[i];
            i++;
            index++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightIndex) {
            array[index] = rightArray[j];
            j++;
            index++;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort
                (new int[]{1, 4, 2, 5, 5, 56, 6, 654, 67, 67, 6, 56, 5, 5, 45, 23})
        ));
    }
}
