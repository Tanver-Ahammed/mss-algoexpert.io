package algoexpert.io.searching;

public class IndexEqualsValue {

    // Time O(n) || space O(1) using brute-force
    public int indexEqualsValue(int[] array) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i)
                return i;
        }
        return -1;
    }

    // Time O(log(n)) || space O(1) using binary search
    public int indexEqualsValue1(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int equalIndex = -1;
        while (low <= high) {
            int mid = high - (high - low) / 2;
            if (array[mid] == mid) {
                equalIndex = mid;
                high = mid - 1;
            } else if (array[mid] > mid)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return equalIndex;
    }

    public static void main(String[] args) {

    }

}
