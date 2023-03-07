package algoexpert.io.sorting;

public class QuickSort {

    public static int[] quickSort(int[] array) {
        // Write your code here.
        quickSortMethod(array, 0, array.length - 1);
        return array;
    }

    private static void quickSortMethod(int[] array, int low, int high) {
        if (low >= high)
            return;
        int pivot = 0;
        pivot = partitionAscOrder(array, low, high);
        quickSortMethod(array, low, pivot - 1);
        quickSortMethod(array, pivot + 1, high);
    }

    public static int partitionAscOrder(int[] array, int low, int high) {
        int pivot = array[high];
        int index = low - 1;
        for (int i = low; i < high; i++) {
            if (array[i] < pivot) {
                ++index;
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
        int temp = array[index + 1];
        array[index + 1] = array[high];
        array[high] = temp;
        return index + 1;
    }

    public static void main(String[] args) {

    }

}
