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
