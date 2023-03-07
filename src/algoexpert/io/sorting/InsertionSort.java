package algoexpert.io.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        // Write your code here.
        int i, j, item;
        for (i = 1; i < array.length; i++) {
            item = array[i];
            j = i - 1;
            while (j >= 0 && array[j] < item) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = item;
        }
        return array;
    }

    public static void main(String[] args) {

    }

}
