package algoexpert.io.searching;

public class BinarySearch {

    // Time O(log(n)) || space O(1) using recursion
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = high - (high - low) / 2;
            if (array[mid] == target)
                return mid;
            else if (array[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
    }

}
