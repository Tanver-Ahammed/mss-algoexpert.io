package algoexpert.io.stack;

import java.util.ArrayList;

public class SortStack {

    public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
        // Write your code here.
        if (stack.size() == 0)
            return stack;
        int top = stack.remove(stack.size() - 1);
        stack = sortStack(stack);
        insert(stack, top);
        return stack;
    }

    private void insert(ArrayList<Integer> stack, int top) {
        if (stack.size() == 0) {
            stack.add(top);
            return;
        }
        int currentTop = stack.get(stack.size() - 1);
        if (currentTop > top) {
            stack.remove(stack.size() - 1);
            insert(stack, top);
            stack.add(currentTop);
        } else
            stack.add(top);
        return;
    }

    public static void main(String[] args) {

    }

}
