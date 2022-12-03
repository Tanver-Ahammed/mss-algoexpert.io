package algoexpert.io.recursion;

public class Nth_Fibonacci {

    // Time O(2^n) || space O(n) using recursion
    public static int getNthFib1(int n) {
        if (n == 2)
            return 1;
        else if (n == 1)
            return 0;
        return getNthFib1(n - 1) + getNthFib1(n - 2);
    }

    // Time O(n) || space O(1)
    public static int getNthFib2(int n) {
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue = 1;
        if (n == 1)
            return firstValue;
        else if (n == 2)
            return secondValue;
        while (n > 3) {
            firstValue = secondValue;
            secondValue = thirdValue;
            thirdValue = firstValue + secondValue;
            --n;
        }
        return thirdValue;
    }

    public static void main(String[] args) {
        System.out.println(getNthFib1(40));
        System.out.println(getNthFib2(40));
    }
}
