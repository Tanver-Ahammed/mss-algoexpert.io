package algoexpert.io.bt;

public class ReverseLinkedList {

    // recursively
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
        return reverse(null, head);
    }

    private static LinkedList reverse(LinkedList previous, LinkedList current) {
        if (current == null)
            return previous;
        LinkedList next = current.next;
        current.next = previous;
        return reverse(current, next);
    }

    // iteratively
    public static LinkedList reverseLinkedList2(LinkedList head) {
        // Write your code here.
        LinkedList reverseHead = null;
        while (head != null) {
            LinkedList next = head.next;
            head.next = reverseHead;
            reverseHead = head;
            head = next;
        }
        return reverseHead;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

}
