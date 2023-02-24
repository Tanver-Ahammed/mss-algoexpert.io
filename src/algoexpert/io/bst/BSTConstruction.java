package algoexpert.io.bst;

public class BSTConstruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            insertHelper(this, value);
            return this;
        }

        private BST insertHelper(BST bst, int value) {
            if (bst == null)
                return new BST(value);
            if (value < bst.value)
                bst.left = insertHelper(bst.left, value);
            else
                bst.right = insertHelper(bst.right, value);
            return bst;
        }

        public boolean contains(int value) {
            // Write your code here.
            return containsHelper(this, value);
        }

        private boolean containsHelper(BST bst, int value) {
            if (bst == null)
                return false;
            else if (value == bst.value)
                return true;
            else if (value < bst.value)
                return containsHelper(bst.left, value);
            else
                return containsHelper(bst.left, value);
        }

        public BST remove(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            removeHelper(this, value);
            return this;
        }

        private BST removeHelper(BST bst, int value) {
            if (bst == null) {
                return bst;
            }
            if (value < bst.value) {
                bst.left = removeHelper(bst.left, value);
            } else if (value > bst.value) {
                bst.right = removeHelper(bst.right, value);
            }
            // if it has no children => dele
            else if (bst.left == null && bst.right == null)
                return null;
                // if it has only one child => replace it with the child
            else if (bst.left != null && bst.right == null) {
                bst.value = bst.left.value;
                bst.right = bst.left.right;
                bst.left = bst.left.left;
                return bst;
            } else if (bst.left == null && bst.right != null) {
                bst.value = bst.right.value;
                bst.left = bst.right.left;
                bst.right = bst.right.right;
                return bst;
            } else {
                int smallest = smallestValue(bst.right);
                bst.value = smallest;
                bst.right = removeHelper(bst.right, value);
                return bst;
            }

            return bst;
        }

        public int smallestValue(BST bst) {
            return bst.left == null ? bst.value : smallestValue(bst.left);
        }

    }

}
