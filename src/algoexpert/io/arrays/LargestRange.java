package algoexpert.io.arrays;

import java.util.HashSet;
import java.util.Set;

public class LargestRange {

    public static int[] largestRange(int[] array) {
        // Write your code here.
        Set<Integer> nums = new HashSet<>();
        for (int num : array)
            nums.add(num);
        int[] result = new int[2];
        int maxRange = 0;
        for (int j : array) {
            if (!nums.contains(j + 1)) {
                int lowRange = j;
                while (nums.contains(--lowRange)) ;
                lowRange += 1;
                if (maxRange < (j - lowRange) + 1) {
                    result[0] = lowRange;
                    result[1] = j;
                    maxRange = (j - lowRange) + 1;
                }
            }
        }
        return result;
    }

}
