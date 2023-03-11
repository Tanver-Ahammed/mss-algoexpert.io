package algoexpert.io.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] array) {
        // Write your code here.
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[array.length];
        Arrays.fill(arr, -1);
        int length = 2 * array.length;
        for (int i = 0; i < length; i++) {
            int index = i % arr.length;
            while (!stack.isEmpty() && array[index] > array[stack.peek()]) {
                int res = stack.pop();
                arr[res] = array[index];
            }
            stack.push(index);
        }
        return arr;
    }

}
