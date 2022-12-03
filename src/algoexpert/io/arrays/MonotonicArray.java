package algoexpert.io.arrays;

public class MonotonicArray {

    // Time O(n) || space O(1)
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        int totalIncrement = 0;
        int totalDecrement = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
                ++totalIncrement;
            else if (array[i] > array[i + 1])
                ++totalDecrement;
        }
        return totalIncrement == 0 || totalDecrement == 0;
    }

    public static void main(String[] args) {
//        int[] array = new int[]{-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        int[] array = new int[]{1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
        System.out.println(isMonotonic(array));

    }
}
