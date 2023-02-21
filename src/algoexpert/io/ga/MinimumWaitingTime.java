package algoexpert.io.ga;

import java.util.Arrays;

public class MinimumWaitingTime {

    // Time O(n log n) || space O(1) using ga
    public int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        int sum = 0;
        int waitingTime = 0;
        for (int i = 0; i < queries.length - 1; i++) {
            sum += queries[i];
            waitingTime += sum;
        }
        return waitingTime;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumWaitingTime().minimumWaitingTime(new int[]{100}));
    }

}
