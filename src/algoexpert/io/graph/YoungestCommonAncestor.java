package algoexpert.io.graph;

import java.util.HashSet;
import java.util.Set;

public class YoungestCommonAncestor {

    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor,
                                                          AncestralTree descendantOne,
                                                          AncestralTree descendantTwo) {
        // Write your code here.
        Set<AncestralTree> set = new HashSet<>();
        AncestralTree trav = descendantOne;

        while (trav != null) {
            set.add(trav);
            trav = trav.ancestor;
        }

        trav = descendantTwo;
        while (trav != null) {
            if (set.contains(trav))
                return trav;
            set.add(trav);
            trav = trav.ancestor;
        }
        return null;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }

}
