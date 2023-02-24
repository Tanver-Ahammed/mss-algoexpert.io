package algoexpert.io.bst;

import java.util.List;

public class MinHeightBST {

    public static BST minHeightBst(List<Integer> array) {
        // Write your code here.
        int arrayLength = array.size();
        if (arrayLength == 0)
            return null;
        int mid = arrayLength / 2;
        BST tree = new BST(array.get(mid));
        tree.left = minHeightBst(array.subList(0, mid));
        tree.right = minHeightBst(array.subList(mid + 1, arrayLength));
        return tree;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }

}
