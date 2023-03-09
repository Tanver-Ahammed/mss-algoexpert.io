package algoexpert.io.arrays;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {

    public boolean zeroSumSubarray(int[] nums) {
        // Write your code here.
        if (nums.length == 0)
            return false;
        Set<Integer> sums = new HashSet<>();
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (sums.contains(currentSum))
                return true;
            sums.add(currentSum);
        }
        return currentSum == 0;
    }

    public static void main(String[] args) {
        System.out.println(new ZeroSumSubarray()
                .zeroSumSubarray(new int[]{2, -2}));
    }

}
