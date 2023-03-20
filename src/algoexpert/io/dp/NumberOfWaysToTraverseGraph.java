package algoexpert.io.dp;

public class NumberOfWaysToTraverseGraph {

    public int numberOfWaysToTraverseGraph(int width, int height) {
        // Write your code here.
        int[][] ways = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == 0 || col == 0)
                    ways[row][col] = 1;
                else {
                    int wayToReachAbove = ways[row - 1][col];
                    int wayToReachLeft = ways[row][col - 1];
                    ways[row][col] = wayToReachAbove + wayToReachLeft;
                }
            }
        }
        return ways[height - 1][width - 1];
    }

}
