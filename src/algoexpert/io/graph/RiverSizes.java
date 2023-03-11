package algoexpert.io.graph;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix) {
        // 0(n*m) time where n is the length of matrix and m is the length of matrix[0]
        // 0(n*m) space
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1)
                    myList.add(DFS(0, i, j, matrix));
            }
        }
        return myList;
    }

    public static int DFS(int size, int i, int j, int[][] matrix) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 0)
            return 0;

        matrix[i][j] = 0;

        int up = DFS(size, i + 1, j, matrix);
        int down = DFS(size, i - 1, j, matrix);
        int left = DFS(size, i, j - 1, matrix);

        int right = DFS(size, i, j + 1, matrix);

        size += up + down + left + right;
        size += 1;

        return size;
    }

}
