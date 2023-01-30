package algoexpert.io.linked.list;

public class LinkedListConstruction {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.

        }

        public void setTail(Node node) {
            // Write your code here.
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
        }

        public void remove(Node node) {
            // Write your code here.
            Node currentHead = this.head;
            
        }

        public boolean containsNodeWithValue(int value) {
            // Write your code here.
            Node currentHead = this.head;
            while (currentHead != null) {
                if (currentHead.value == value)
                    return true;
                currentHead = currentHead.next;
            }
            return false;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
            prev = null;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListConstruction llc = new LinkedListConstruction();
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.setHead(new Node(6));
    }
}
