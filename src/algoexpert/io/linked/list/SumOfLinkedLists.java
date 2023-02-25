package algoexpert.io.linked.list;

public class SumOfLinkedLists {

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        // Write your code here.
        LinkedList sum = new LinkedList(0);
        LinkedList temp = sum;
        int carry = 0;
        while (linkedListOne != null || linkedListTwo != null) {
            int currentDigit = carry;
            if (linkedListOne != null) {
                currentDigit += linkedListOne.value;
                linkedListOne = linkedListOne.next;
            }
            if (linkedListTwo != null) {
                currentDigit += linkedListTwo.value;
                linkedListTwo = linkedListTwo.next;
            }
            carry = currentDigit / 10;
            currentDigit = currentDigit % 10;

            temp.value = currentDigit;

            if (linkedListOne != null || linkedListTwo != null || carry > 0) {
                temp.next = new LinkedList(0);
                temp = temp.next;
            }
        }
        if (carry > 0)
            temp.value = carry;
        return sum;
    }


    public static void main(String[] args) {

    }

}
