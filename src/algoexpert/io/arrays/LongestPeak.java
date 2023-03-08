package algoexpert.io.arrays;

public class LongestPeak {


    public static int longestPeak(int[] array) {
        // Write your code here.
        int longestPeakLength = 0;
        int count = 0;
        boolean isPeak = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i] && !isPeak)
                count = (count == 0) ? 2 : count + 1;
            else if (count > 0 && array[i - 1] > array[i]) {
                count = count + 1;
                longestPeakLength = Math.max(longestPeakLength, count);
                isPeak = true;
            } else if (isPeak && array[i - 1] < array[i]) {
                count = 2;
                isPeak = false;
            } else {
                count = 0;
                isPeak = false;
            }
        }
        return longestPeakLength;
    }

    public static void main(String[] args) {
        var input = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(input));
    }

}
