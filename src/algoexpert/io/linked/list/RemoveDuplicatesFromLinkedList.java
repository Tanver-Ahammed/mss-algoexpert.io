package algoexpert.io.linked.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromLinkedList {

    private LinkedList head;

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList head = linkedList;
        while (linkedList.next != null) {
            if (linkedList.value == linkedList.next.value)
                linkedList.next = linkedList.next.next;
            else
                linkedList = linkedList.next;
        }
        return head;
    }

    public static LinkedList addMany(RemoveDuplicatesFromLinkedList.LinkedList ll, List<Integer> values) {
        RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new RemoveDuplicatesFromLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        LinkedList output = new RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(input);

        while (output != null) {
            System.out.println(output.value);
            output = output.next;
        }
    }

}
