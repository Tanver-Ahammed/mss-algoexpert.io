package algoexpert.io.bt;

public class NodeDepths {

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // Time O(n) || space O(n) using ga
    private static int totalDepth = 0;

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        totalDepth = 0;
        sumCalculate(root, 0);
        return totalDepth;
    }

    public static void sumCalculate(BinaryTree root, int level) {
        totalDepth += level;
        if (root.left != null)
            sumCalculate(root.left, level + 1);
        if (root.right != null)
            sumCalculate(root.right, level + 1);
    }

    // Time O(n) || space O(n)
    public static int nodeDepths2(BinaryTree root) {
        // Write your code here.
        return sumCalculate2(root, 0);
    }

    public static int sumCalculate2(BinaryTree root, int depth) {
        if (root == null)
            return 0;
        return depth + sumCalculate2(root.left, depth + 1) + sumCalculate2(root.right, depth + 1);
    }

    public static void main(String[] args) {

    }

}
