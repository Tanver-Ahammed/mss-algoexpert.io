package algoexpert.io.linked.list;

public class ShiftLinkedList {

    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        // Write your code here.
        if (head == null || head.next == null || k == 0)
            return head;
        LinkedList element = head;
        int size = 1;

        // Count size of List
        while (element.next != null) {
            size++;
            element = element.next;
        }

        // Normalize k
        int normK = k % size;
        if (normK == 0)
            return head;

        //Make LL a loop - connect end to head
        element.next = head;

        LinkedList newHead = null;
        int newEndIndex = size - normK;

        for (int i = 0; i <= newEndIndex; i++) {
            if (i == newEndIndex) {
                // Save new head
                newHead = element.next;
                // Disconnect end from new head
                element.next = null;
            }
            element = element.next;
        }
        return newHead;
    }

    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }

}
