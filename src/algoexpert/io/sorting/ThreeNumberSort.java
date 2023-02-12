package algoexpert.io.sorting;

public class ThreeNumberSort {

    // Time O(n) || space O(1) using recursion
    public int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.

        return new int[]{};
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1 || n == 4)
            return true;
        while (n >= 4) {
            if (n == 4 || n == 16)
                return true;
            else if (n % 16 != 0)
                return false;
            n = n / 16;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfFour(65));

    }

}
