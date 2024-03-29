package algoexpert.io.linked.list;

public class LinkedListConstruction {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.
            if (this.head == null) {
                this.head = node;
                this.tail = node;
                return;
            }
            this.insertBefore(this.head, node);
        }

        public void setTail(Node node) {
            // Write your code here.
            if (this.head == null) {
                this.setHead(node);
                return;
            }
            this.insertAfter(this.tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
            Node current = this.head;
            if (nodeToInsert == this.head && nodeToInsert == this.tail)
                return;
            this.remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if (node.prev == null)
                this.head = nodeToInsert;
            else
                node.prev.next = nodeToInsert;
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
            //Node current=this.head;
            if (nodeToInsert == this.head && nodeToInsert == this.tail)
                return;
            this.remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if (node.next == null)
                this.tail = nodeToInsert;
            else
                node.next.prev = nodeToInsert;
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
            if (position == 1) {
                this.setHead(nodeToInsert);
                return;
            }
            Node current = this.head;
            int currentPosition = 1;
            while (current != null && currentPosition != position) {
                current = current.next;
                currentPosition++;
            }
            if (current != null)
                this.insertBefore(current, nodeToInsert);
            else
                this.setTail(nodeToInsert);
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
            Node current = this.head;
            while (current != null) {
                Node temp = current;
                current = current.next;
                if (temp.value == value)
                    remove(temp);
            }
        }

        public void remove(Node node) {
            // Write your code here.
            if (node == this.head) this.head = this.head.next;
            if (node == this.tail) this.tail = this.tail.prev;

            if (node.prev != null)
                node.prev.next = node.next;
            if (node.next != null)
                node.next.prev = node.prev;
            node.next = null;
            node.prev = null;
        }

        public boolean containsNodeWithValue(int value) {
            // Write your code here.
            Node current = this.head;
            while (current != null) {
                if (current.value == value)
                    return true;
                current = current.next;
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
        }
    }
}
