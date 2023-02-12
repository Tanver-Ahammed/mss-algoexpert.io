package algoexpert.io.searching;

import java.util.Arrays;

public class SearchForRange {
// Time O(n) || space O(1) using binary search
    // Time O(n) || space O(1) using recursion
    public static int[] searchForRange(int[] array, int target) {
        // Write your code here.
        int firstIndex = -1;
        int lastIndex = -1;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target && !flag) {
                firstIndex = i;
                lastIndex = i;
                flag = true;
            } else if (array[i] == target && flag) {
                lastIndex++;
            } else if (flag)
                break;
        }
        return new int[]{firstIndex, lastIndex};
    }

    // Time O(n) || space O(1) using binary search
    public static int[] searchForRange1(int[] array, int target) {
        // Write your code here.
        int left = leftBinarySearch(array, target);
        if (left == -1)
            return new int[]{-1, -1};
        int right = rightBinarySearch(array, target);
        return new int[]{left, right};
    }

    private static int leftBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int leftIndex = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == target) {
                leftIndex = mid;
                high--;
            } else if (array[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return leftIndex;
    }

    private static int rightBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int rightIndex = -1;
        while (low <= high) {
            int mid = high - (high - low) / 2;
            if (array[mid] == target) {
                rightIndex = mid;
                low++;
            } else if (array[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return rightIndex;
    }

    public static void main(String[] args) {

        int[] array = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchForRange1(array, 5)));

    }
}
