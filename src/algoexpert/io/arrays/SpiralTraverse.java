package algoexpert.io.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    // Time O(n) || space O(n) using brute force
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        List<Integer> spiralList = new ArrayList<>();
        int startRow = 0, endRow = array.length - 1;
        int startCol = 0, endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col < endCol + 1; col++)
                spiralList.add(array[startRow][col]);
            for (int row = startRow + 1; row < endRow + 1; row++)
                spiralList.add(array[row][endCol]);
            if (endRow > startRow) {
                for (int col = endCol - 1; col > startCol; col--)
                    spiralList.add(array[endRow][col]);
            }
            if (endCol > startCol) {
                for (int row = endRow; row >= startRow + 1; row--)
                    spiralList.add(array[row][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return spiralList;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9, 8, 7}};

        System.out.println(spiralTraverse(array));

    }
}
