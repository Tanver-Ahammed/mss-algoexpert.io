package algoexpert.io.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {

    }

}
