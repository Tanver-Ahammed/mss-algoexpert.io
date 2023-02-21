package algoexpert.io.bt;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    // This is the class of the input root. Do not edit it.
    // Time O(n) || space O(n) using ga
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> results = new ArrayList<>();
        calculateSum(root, 0, results);
        return results;
    }

    public static void calculateSum(BinaryTree root, int sum, List<Integer> results) {
        if (root == null)
            return;
        sum += root.value;
        if (root.left == null && root.right == null) {
            results.add(sum);
            return;
        }
        calculateSum(root.left, sum, results);
        calculateSum(root.right, sum, results);
    }

}
