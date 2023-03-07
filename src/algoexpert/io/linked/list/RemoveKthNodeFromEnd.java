package algoexpert.io.linked.list;

public class RemoveKthNodeFromEnd {

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        LinkedList temp = head;
        int length = 1;
        while (temp.next != null) {
            ++length;
            temp = temp.next;
        }

        int indexToRemove = length - k;
        if (indexToRemove == 0) {
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }
        temp = head;
        for (int i = 0; i < indexToRemove - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
