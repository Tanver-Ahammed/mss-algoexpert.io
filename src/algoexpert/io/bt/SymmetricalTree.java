package algoexpert.io.bt;

public class SymmetricalTree {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean symmetricalTree(BinaryTree tree) {
        // Write your code here.
        return recursion(tree.left, tree.right);
    }

    private boolean recursion(BinaryTree tl, BinaryTree tr) {
        if ((tl == null && tr == null))
            return true;
        else if ((tl == null && tr != null) || (tl != null && tr == null) || (tl.value != tr.value))
            return false;
        return recursion(tl.left, tr.right) && recursion(tl.right, tr.left);
    }


}
