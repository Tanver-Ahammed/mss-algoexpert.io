package algoexpert.io.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/two-sum/
public class TwoNumberSum {

    // Time O(n^2) || space O(1)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] temp = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    temp[0] = array[i];
                    temp[1] = array[j];
                    return temp;
                }
            }
        }
        return new int[0];
    }

    // Time O(n) || space O(n) using hash set
    public static int[] twoNumberSum1(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> nums = new HashSet<>();
        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (nums.contains(potentialMatch)) {
                return new int[]{num, potentialMatch};
            } else {
                nums.add(num);
            }
        }
        return new int[0];
    }

    // Time O(nlogn) || space O(1)
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int currentSum = array[low] + array[high];
            if (currentSum == targetSum)
                return new int[]{array[low], array[high]};
            else if (currentSum < targetSum)
                low++;
            else
                high--;
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
        System.out.println(Arrays.toString(twoNumberSum1(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
        System.out.println(Arrays.toString(twoNumberSum2(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));

    }

}
