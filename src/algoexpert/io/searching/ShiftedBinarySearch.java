package algoexpert.io.searching;

public class ShiftedBinarySearch {

    // Time O(n) || space O(1) using linear search
    public static int shiftedBinarySearch(int[] array, int target) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }

    // Time O(n log(n)) || space O(1) using binary search
    public static int shiftedBinarySearch1(int[] array, int target) {
        // Write your code here.
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = right - (right - left) / 2;
            int potentialMatch = array[mid];
            int leftNumber = array[left];
            int rightNumber = array[right];

            if (potentialMatch == target)
                return mid;
            else if (leftNumber <= potentialMatch) {
                if (target < potentialMatch && target >= leftNumber)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (target > potentialMatch && target <= rightNumber)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
