package algoexpert.io.arrays;

import java.util.ArrayList;
import java.util.List;

public class ZigzagTraverse {

    enum Direction {
        UP, DOWN
    }

    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        // Write your code here.
        List<Integer> results = new ArrayList<>();
        int rows = array.size();
        int cols = array.get(0).size();
        int i = 0, j = 0;
        Direction direction = Direction.DOWN;
        while (i < rows && j < cols) {
            results.add(array.get(i).get(j));
            if (j == 0 && direction == Direction.DOWN && i != rows - 1) {
                ++i;
                direction = Direction.UP;
            } else if (i == 0 && direction == Direction.UP && j != cols - 1) {
                ++j;
                direction = Direction.DOWN;
            } else if (j == cols - 1 && direction == Direction.UP) {
                ++i;
                direction = Direction.DOWN;
            } else if (i == rows - 1 && direction == Direction.DOWN) {
                ++j;
                direction = Direction.UP;
            } else if (direction == Direction.UP) {
                i++;
                j--;
            } else {
                i--;
                j++;
            }
        }
        return results;
    }

}
