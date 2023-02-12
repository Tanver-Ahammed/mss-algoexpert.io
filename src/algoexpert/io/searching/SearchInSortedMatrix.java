package algoexpert.io.searching;

import java.util.Arrays;

public class SearchInSortedMatrix {

    // Time O(n^2) || space O(1) using recursion
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        // Write your code here.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
                if (matrix[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[][] arr = new int[][]
                {
                        {1, 4, 7, 12, 15, 1000},
                        {2, 5, 19, 31, 32, 1001},
                        {3, 8, 24, 33, 35, 1002},
                        {40, 41, 42, 44, 45, 1003},
                        {99, 100, 103, 106, 128, 1004}
                };
        System.out.println(Arrays.toString(searchInSortedMatrix(arr, 1000)));

    }

}
