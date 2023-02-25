package algoexpert.io.linked.list;

public class RemoveKthNodeFromEnd {

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        LinkedList temp = head;
        int length = 1;
        while (temp != null) {
            ++length;
            temp = temp.next;
        }

        int indexToRemove = length - k;
        if (indexToRemove == 0) {
            head = head.next;
        }
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

    }

}
