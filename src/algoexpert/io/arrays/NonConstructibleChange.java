package algoexpert.io.arrays;

import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        if (coins.length == 0)
            return 1;
        Arrays.sort(coins);

        int currentValue = 0;
        for (int coin : coins) {
            if (coin > currentValue + 1)
                return currentValue + 1;
            currentValue += coin;
        }
        return currentValue + 1;
    }

    public static void main(String[] args) {
        System.out.println(new NonConstructibleChange()
                .nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}));
    }

}
