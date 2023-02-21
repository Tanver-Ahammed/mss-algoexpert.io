package algoexpert.io.ga;

import java.util.Arrays;

public class TandemBicycle {

    // Time O(n log n) || space O(1) using ga
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int totalSpeed = 0;
        for (int i = 0; i < redShirtSpeeds.length; i++) {
            if (fastest)
                totalSpeed += Math.max(redShirtSpeeds[i], blueShirtSpeeds[blueShirtSpeeds.length - i - 1]);
            else
                totalSpeed += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }
        return totalSpeed;
    }

    public static void main(String[] args) {

    }

}
