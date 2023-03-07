package algoexpert.io.bst;

import java.util.ArrayList;
import java.util.List;

public class FindSuccessor {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    // Time O(h) || space O(n) using recursion
    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        List<BinaryTree> inOrder = new ArrayList<>();
        getInOrderTraversal(tree, inOrder);
        int index = 0;
        boolean isBreak = false;
        for (index = 0; index < inOrder.size(); index++) {
            if (inOrder.get(index) == node) {
                isBreak = true;
                break;
            }
        }
        if (isBreak && index != inOrder.size() - 1)
            return inOrder.get(index + 1);
        return null;
    }

    private void getInOrderTraversal(BinaryTree tree, List<BinaryTree> inOrder) {
        if (tree == null)
            return;
        getInOrderTraversal(tree.left, inOrder);
        inOrder.add(tree);
        getInOrderTraversal(tree.right, inOrder);
    }

    // Time O(h) || space O(1) using recursion
    boolean isTargetNodeLocated = false;
    BinaryTree resultNode = null;

    public BinaryTree findSuccessor2(BinaryTree tree, BinaryTree node) {
        findSuccessorHelper(tree, node);
        return resultNode;
    }

    private void findSuccessorHelper(BinaryTree tree, BinaryTree node) {
        if (tree == null)
            return;
        findSuccessorHelper(tree.left, node);
        if (tree == node)
            isTargetNodeLocated = true;
        else if (isTargetNodeLocated && resultNode == null) {
            resultNode = tree;
        }
        findSuccessorHelper(tree.right, node);
    }

}
