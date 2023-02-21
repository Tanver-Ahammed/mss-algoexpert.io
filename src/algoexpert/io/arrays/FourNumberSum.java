package algoexpert.io.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourNumberSum {

    // Time O(n^4) || space O(n^2)
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        int target = array[i] + array[j] + array[k] + array[l];
                        if (target == targetSum) {
                            Integer[] arr = new Integer[]{array[i], array[j], array[k], array[l]};
                            result.add(arr);
                        }
                    }
                }
            }
        }
        return result;
    }

    // Time O(n^4) || space O(n^2)
    public static List<Integer[]> fourNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int target = targetSum - array[i] - array[j];
                int low = 0;
                int high = array.length - 1;
                while (low < high) {
                    int currentSum = array[low] + array[high];
                    if (currentSum == target) {
                        Integer[] arr = new Integer[]{array[i], array[j], array[low], array[high]};
                        result.add(arr);
                    } else if (currentSum < target) low++;
                    else high--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16));
    }

}
