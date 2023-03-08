package algoexpert.io.linked.list;

public class MergeLinkedLists {

    // This is an input class. Do not edit.
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        // Write your code here.
        if (headOne == null && headTwo == null)
            return null;
        if (headOne == null)
            return headTwo;
        if (headTwo == null)
            return headOne;
        if (headOne.value < headTwo.value) {
            headOne.next = mergeLinkedLists(headOne.next, headTwo);
            return headOne;
        }
        headTwo.next = mergeLinkedLists(headOne, headTwo.next);
        return headTwo;
    }

}
