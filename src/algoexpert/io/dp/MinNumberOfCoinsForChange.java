package algoexpert.io.dp;

import java.util.Arrays;

public class MinNumberOfCoinsForChange {

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        // Write your code here.
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int amount = 0; amount <= n; amount++) {
            for (int i = 0; i < denoms.length; i++) {
                if (amount >= denoms[i]) {
                    int k = amount - denoms[i];
                    if (dp[k] != Integer.MAX_VALUE)
                        dp[amount] = Integer.min(dp[amount], dp[k] + 1);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }

    public static void main(String[] args) {
        System.out.println(minNumberOfCoinsForChange(7, new int[]{1, 5, 10}));
    }

}
