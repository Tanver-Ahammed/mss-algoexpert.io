package algoexpert.io.recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array) {
        // Write your code here.
        return calculateInnerSum(1, array);
    }

    public static int calculateInnerSum(int depth, List<Object> array) {
        int innerSum = 0;
        for (Object arr : array) {
            if (arr instanceof List)
                innerSum += calculateInnerSum(depth + 1, (List<Object>) arr);
            else
                innerSum += (int) arr;
        }
        return depth * innerSum;
    }

    public static void main(String[] args) {

    }
}
