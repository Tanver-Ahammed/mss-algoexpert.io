package algoexpert.io.bst;

public class ValidateThreeNodes {

    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public boolean validateThreeNodes (BST nodeOne, BST nodeTwo, BST nodeThree) {

        final boolean isNodeOneAncestor = checkIfAncestor(nodeOne,nodeTwo);

        final boolean isNodeThreeAncestor = checkIfAncestor(nodeThree,nodeTwo);
        final boolean isNodeOneDescendant = checkIfAncestor(nodeTwo,nodeOne);
        final boolean isNodeThreeDescendant = checkIfAncestor(nodeTwo,nodeThree);

        return ( isNodeOneAncestor && isNodeThreeDescendant ) ||
                ( isNodeThreeAncestor && isNodeOneDescendant );

    }

    public boolean checkIfAncestor(BST ancestor, BST descendant) {
        BST currentNode = ancestor;
        while(currentNode != null){
            if(descendant.value == currentNode.value) return true;
            else if(descendant.value < currentNode.value){
                currentNode = currentNode. left;
            }else currentNode = currentNode.right;
        }
        return false;

    }

}
