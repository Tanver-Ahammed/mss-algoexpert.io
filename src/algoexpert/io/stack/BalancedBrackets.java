package algoexpert.io.stack;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '(':
                    stack.push(')');
                    break;
                default:
                    if (ch != ']' && ch != '}' && ch != ')')
                        break;
                    if (stack.isEmpty() || stack.pop() != ch)
                        return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
