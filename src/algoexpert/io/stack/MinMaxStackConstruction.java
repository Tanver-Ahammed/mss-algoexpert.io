package algoexpert.io.stack;

public class MinMaxStackConstruction {

    static class Node {
        int value;
        int min;
        int max;
        Node next;

        public Node(int value, int min, int max, Node next) {
            this.value = value;
            this.min = min;
            this.max = max;
            this.next = next;
        }
    }

    // Feel free to add new properties and methods to the class.
    static class MinMaxStack {
        Node head;

        public int peek() {
            return head.value;
        }

        public int pop() {
            int popValue = head.value;
            head = head.next;
            return popValue;
        }

        public void push(Integer number) {
            if (head == null)
                head = new Node(number, number, number, null);
            else
                head = new Node(number, Math.min(number, head.min),
                        Math.max(number, head.max), head);
        }

        public int getMin() {
            // Write your code here.
            return head.min;
        }

        public int getMax() {
            // Write your code here.
            return head.max;
        }
    }

}






/*

package algoexpert.io.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinMaxStackConstruction {

    // Feel free to add new properties and methods to the class.
    static class MinMaxStack {
        static private Stack<Integer> min = new Stack<>();
        static private Stack<Integer> max = new Stack<>();
        private Stack<Integer> stack = new Stack<>();

        public int peek() {
            if (stack.isEmpty())
                return -1;
            return stack.get(stack.size() - 1);
        }

        public int pop() {
            if (stack.isEmpty())
                return -1;
            int element = stack.pop();

            if (element == min.peek())
                min.pop();
            if (element == max.peek())
                max.pop();
            return element;
        }

        public void push(Integer number) {
            stack.push(number);
            if (min.isEmpty() || min.peek() >= number) {
                min.push(number);
            }
            if (max.isEmpty() || max.peek() <= number) {
                max.push(number);
            }
        }

        public int getMin() {
            // Write your code here.
            if (stack.isEmpty())
                return -1;
            return min.peek();
        }

        public int getMax() {
            // Write your code here.
            if (stack.isEmpty())
                return -1;
            return max.peek();
        }
    }

    public static void main(String[] args) {

    }

}
*/
