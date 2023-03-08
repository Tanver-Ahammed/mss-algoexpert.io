package algoexpert.io.bt;

public class CompareLeafTraversal {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean compareLeafTraversal(BinaryTree tree1, BinaryTree tree2) {
        // Write your code here.
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        iterate(tree1, sb1);
        iterate(tree2, sb2);
        return sb1.toString().equals(sb2.toString());
    }

    private void iterate(BinaryTree tree, StringBuilder sb) {
        if (tree == null)
            return;
        if (tree.left == null && tree.right == null) {
            sb.append(String.valueOf(tree.value)).append(",");
        }
        iterate(tree.left, sb);
        iterate(tree.right, sb);
    }

}
