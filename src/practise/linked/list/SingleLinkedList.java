package practise.linked.list;

public class SingleLinkedList {


    Node head = null;


    // create a node
    static class Node {
        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

}
