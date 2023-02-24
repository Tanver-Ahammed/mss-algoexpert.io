package algoexpert.io.bst;

import java.util.ArrayList;

public class ReconstructBST {

    // This is an input class. Do not edit.
    // insert method O(n) time O(n) space
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
        // Write your code here.
        BST root = new BST(preOrderTraversalValues.get(0));
        for (int i = 1; i < preOrderTraversalValues.size(); i++)
            insertNode(preOrderTraversalValues.get(i), root);
        return root;
    }

    public void insertNode(int value, BST tree) {
        if (value >= tree.value) {
            if (tree.right == null)
                tree.right = new BST(value);
            else
                insertNode(value, tree.right);
        } else {
            if (tree.left == null)
                tree.left = new BST(value);
            else
                insertNode(value, tree.left);
        }
    }

    public static void main(String[] args) {

    }

}
