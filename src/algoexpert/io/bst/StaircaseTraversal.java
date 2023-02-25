package algoexpert.io.bst;

public class StaircaseTraversal {

    public int staircaseTraversal(int height, int maxSteps) {
        // Write your code here.
        int[] dp = new int[height + 1];
        dp[0] = 1;
        int currentNumberOfWays = 0;
        for (int i = 1; i < height + 1; i++) {
            int startOfWindow = i - maxSteps - 1;
            int endOfWindow = i - 1;
            if (startOfWindow >= 0)
                currentNumberOfWays -= dp[startOfWindow];
            currentNumberOfWays += dp[endOfWindow];
            dp[i] = currentNumberOfWays;
        }
        return dp[height];
    }

    public static void main(String[] args) {
        System.out.println(new StaircaseTraversal().staircaseTraversal(4, 4));
    }

}
