package algoexpert.io.bt;

public class InvertBinaryTree {

    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        if (tree == null)
            return;
        BinaryTree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

    }
}
