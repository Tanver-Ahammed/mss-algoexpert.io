package algoexpert.io.bst;

public class ValidateBST {

    public static boolean validateBst(BST tree) {
        // Write your code here.
        return validChecker(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validChecker(BST tree, int minValue, int maxValue) {
        if (tree == null)
            return true;
        if (tree.value < minValue || tree.value >= maxValue)
            return false;
        return validChecker(tree.left, minValue, tree.value) &&
                validChecker(tree.right, tree.value, maxValue);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

    }

}
