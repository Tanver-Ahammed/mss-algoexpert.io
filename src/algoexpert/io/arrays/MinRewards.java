package algoexpert.io.arrays;

public class MinRewards {

    public static int minRewards(int[] scores) {
        // Write your code here.
        int lastMaxIndex = 0;
        int lastMaxReward = 1;
        int previousReward = 1;
        int totalRewards = 1;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[i - 1]) {
                totalRewards += ++previousReward;
                lastMaxIndex = i;
                lastMaxReward = previousReward;
            } else {
                if (previousReward == 1) {
                    totalRewards += i - lastMaxIndex;
                    if (i - lastMaxIndex >= lastMaxReward) totalRewards++;
                } else totalRewards += 1;
                previousReward = 1;
            }
        }
        return totalRewards;
    }

}
