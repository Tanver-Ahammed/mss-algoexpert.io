package algoexpert.io.bst;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValue(tree, target, tree.value);
    }

    public static int findClosestValue(BST tree, int target, int closest) {
        if (tree == null) {
            return closest;
        }
        int currentDifferent = Math.abs(target - tree.value);
        int closestDifferent = Math.abs(target - closest);
        if (currentDifferent < closestDifferent)
            closest = tree.value;
        if (tree.value < target)
            return findClosestValue(tree.right, target, closest);
        return findClosestValue(tree.left, target, closest);
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
