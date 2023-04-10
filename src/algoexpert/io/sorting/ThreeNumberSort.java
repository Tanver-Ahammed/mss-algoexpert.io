package algoexpert.io.sorting;

public class ThreeNumberSort {

    // Time O(n) || space O(n) using recursion
    public int[] threeNumberSort1(int[] array, int[] order) {
        // Write your code here.
        int[] newArray = new int[array.length];
        int index = 0;
        for (int j : array) {
            if (j == order[0]) {
                newArray[index] = j;
                ++index;
            }
        }
        for (int j : array) {
            if (j == order[1]) {
                newArray[index] = j;
                ++index;
            }
        }
        for (int j : array) {
            if (j == order[2]) {
                newArray[index] = j;
                ++index;
            }
        }
        return newArray;
    }


    // Time O(n) || space O(1)
    public int[] threeNumberSort2(int[] array, int[] order) {
        // Write your code here.
        int i = -1;
        int j = 0;
        int k = array.length;
        while (j < k) {
            if (array[j] == order[0] && i != j) {
                ++i;
                swap(i, j, array);
            } else if (array[j] == order[2]) {
                --k;
                swap(j, k, array);
            } else
                j++;
        }
        return array;
    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

    }

}
