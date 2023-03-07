package algoexpert.io.linked.list;

public class MergingLinkedLists {

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;
        public boolean isVisited;

        public LinkedList(int value) {
            this.value = value;
            this.isVisited = false;
            this.next = null;
        }
    }

    public LinkedList mergingLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        // Write your code here.
        while (linkedListOne != null) {
            linkedListOne.isVisited = true;
            linkedListOne = linkedListOne.next;
        }
        while (linkedListTwo != null) {
            if (linkedListTwo.isVisited)
                return linkedListTwo;
            linkedListTwo = linkedListTwo.next;
        }
        return null;
    }

    public static void main(String[] args) {

    }

}
