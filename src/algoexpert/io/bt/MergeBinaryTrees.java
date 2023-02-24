package algoexpert.io.bt;

public class MergeBinaryTrees {

    // time O(n) and Space O(h)
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree mergeBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
        // Write your code here.
        if (tree1 == null)
            return tree2;
        if (tree2 == null)
            return tree1;
        tree1.value += tree2.value;
        tree1.left = mergeBinaryTrees(tree1.left, tree2.left);
        tree1.right = mergeBinaryTrees(tree1.right, tree2.right);
        return tree1;
    }

    private void recursion(BinaryTree tree, BinaryTree tree1, BinaryTree tree2) {
        if (tree == null)
            return;
        tree.value = tree1.value + tree2.value;
        recursion(tree.left, tree1.left, tree2.left);
        recursion(tree.right, tree1.right, tree2.right);
    }

}
