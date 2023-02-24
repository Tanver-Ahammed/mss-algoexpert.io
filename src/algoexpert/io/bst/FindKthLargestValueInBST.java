package algoexpert.io.bst;

import java.util.ArrayList;
import java.util.List;

public class FindKthLargestValueInBST {

    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        List<Integer> list = traverseAndFinKthValue(tree, new ArrayList<>());
        return list.get(list.size() - k - 1);
    }

    private List<Integer> traverseAndFinKthValue(BST tree, List<Integer> list) {
        if (tree == null)
            return list;
        traverseAndFinKthValue(tree.left, list);
        list.add(tree.value);
        traverseAndFinKthValue(tree.right, list);
        return list;
    }


}
