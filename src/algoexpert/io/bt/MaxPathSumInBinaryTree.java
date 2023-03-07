package algoexpert.io.bt;

public class MaxPathSumInBinaryTree {

    static int maxPathSum;

    public static int maxPathSum(BinaryTree tree) {
        // Write your code here.
        maxPathSum = Integer.MIN_VALUE;
        solve(tree);
        return maxPathSum;
    }

    private static int solve(BinaryTree tree) {
        if (tree == null) return 0;
        int leftSum = Math.max(solve(tree.left), 0);
        int rightSum = Math.max(solve(tree.right), 0);
        maxPathSum = Math.max(maxPathSum, tree.value + leftSum + rightSum);
        return tree.value + Math.max(leftSum, rightSum);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

}
