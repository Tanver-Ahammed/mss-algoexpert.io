package algoexpert.io.bt;

public class BinaryTreeDiameter {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    int maxDiameter = 0;

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        recursion(tree);
        return maxDiameter;
    }

    public int recursion(BinaryTree tree) {
        if (tree == null)
            return 0;
        int left = recursion(tree.left);
        int right = recursion(tree.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }

}
