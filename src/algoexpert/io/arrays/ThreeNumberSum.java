package algoexpert.io.arrays;

import java.util.*;

public class ThreeNumberSum {

    // Time O(n^3) || space O(1)
    public static List<Integer[]> threeNumberSum1(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> allTriplets = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if (sum == targetSum) {
                        Integer[] a = new Integer[]{array[i], array[j], array[k]};
                        allTriplets.add(a);
                    }
                }
            }
        }
        return allTriplets;
    }

    // Time O(n^2) || space O(1)
    public static List<Integer[]> threeNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        // -8, -6, 1, 2, 3, 5, 6, 12
        List<Integer[]> allTriplets = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int twoSum = targetSum - array[i];
            Set<Integer> integerSet = new HashSet<>();
            for (int j = i + 1; j < array.length; j++) {
                int potentialTarget = twoSum - array[j];
                if (integerSet.contains(potentialTarget)) {
                    Integer[] a = new Integer[]{array[i], potentialTarget, array[j]};
                    allTriplets.add(a);
                } else {
                    integerSet.add(array[j]);
                }
            }
        }
        return allTriplets;
    }

    // Time O(n^2) || space O(1)
    public static List<Integer[]> threeNumberSum3(int[] array, int targetSum) {
        // Write your code here.
        // -8, -6, 1, 2, 3, 5, 6, 12
        List<Integer[]> allTriplets = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int twoSum = targetSum - array[i];
            int low = i + 1;
            int high = array.length - 1;
            while (low < high) {
                int currentSum = array[low] + array[high];
                if (currentSum == twoSum) {
                    Integer[] arr = new Integer[]{array[i], array[low++], array[high--]};
                    allTriplets.add(arr);
                } else if (currentSum < twoSum) ++low;
                else --high;
            }
        }
        return allTriplets;
    }

    public static void main(String[] args) {

        List<Integer[]> integers1 = threeNumberSum1(new int[]
                {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        for (Integer[] integer : integers1) {
            System.out.println(Arrays.toString(integer));
        }
        System.out.println();
        List<Integer[]> integers2 = threeNumberSum2(new int[]
                {-8, -6, 1, 2, 3, 5, 6, 12}, 0);
        for (Integer[] integer : integers2) {
            System.out.println(Arrays.toString(integer));
        }
        System.out.println();
        List<Integer[]> integers3 = threeNumberSum3(new int[]
                {-8, -6, 1, 2, 3, 5, 6, 12}, 0);
        for (Integer[] integer : integers3) {
            System.out.println(Arrays.toString(integer));
        }

    }

}
