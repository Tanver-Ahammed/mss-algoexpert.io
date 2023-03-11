package algoexpert.io.linked.list;

import java.util.HashMap;

public class LruCache {

    static class LRUCache {
        int maxSize;
        HashMap<String, Node> hm;
        Node dummyHead = new Node();
        Node dummyTail = new Node();

        public LRUCache(int maxSize) {
            this.maxSize = Math.max(maxSize, 1);
            hm = new HashMap<>(maxSize);
            dummyHead.next = dummyTail;
            dummyTail.prev = dummyHead;
        }

        public void insertKeyValuePair(String key, int value) {
            // Write your code here.
            Node node = hm.get(key);
            if (node != null) {
                remove(node);
                node.value = value;
                add(node);
            } else {
                if (hm.size() == maxSize) {
                    hm.remove(dummyTail.prev.key);
                    remove(dummyTail.prev);

                }

                Node newNode = new Node(key, value);
                hm.put(key, newNode);
                add(newNode);
            }
        }

        public LRUResult getValueFromKey(String key) {
            // Write your code here.
            Node node = hm.get(key);
            if (node != null) {
                LRUResult lruResult = new LRUResult(true, hm.get(key).value);
                remove(node);
                add(node);
                return lruResult;
            }
            return null;
        }

        private void add(Node node) {
            Node head_next = dummyHead.next;
            node.next = head_next;
            head_next.prev = node;

            dummyHead.next = node;
            node.prev = dummyHead;
        }

        private void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        public String getMostRecentKey() {
            // Write your code here.
            return dummyHead.next.key;
        }
    }

    static class LRUResult {
        boolean found;
        int value;

        public LRUResult(boolean found, int value) {
            this.found = found;
            this.value = value;
        }
    }

    static class Node {
        String key;
        int value;
        Node next;
        Node prev;

        public Node() {
        }

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}
