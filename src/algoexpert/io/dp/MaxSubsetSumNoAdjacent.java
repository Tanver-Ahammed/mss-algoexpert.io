package algoexpert.io.dp;

public class MaxSubsetSumNoAdjacent {

    // Time O(n) || space O(n)
    public static int maxSubsetSumNoAdjacent1(int[] array) {
        // Write your code here.
        int[] maxSumArr = new int[array.length];
        if (array.length == 0)
            return 0;
        else if (array.length == 1)
            return array[0];
        maxSumArr[0] = array[0];
        maxSumArr[1] = Math.max(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            maxSumArr[i] = Math.max(maxSumArr[i - 1], maxSumArr[i - 2] + array[i]);
        }
        return maxSumArr[array.length - 1];
    }

    // Time O(n) || space O(1)
    public static int maxSubsetSumNoAdjacent2(int[] array) {
        // Write your code here.
        if (array.length == 0)
            return 0;
        else if (array.length == 1)
            return array[0];
        int secondMaxSum = array[0];
        int firstMaxSum = Math.max(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            int currentMaxSum = Math.max(firstMaxSum, secondMaxSum + array[i]);
            secondMaxSum = firstMaxSum;
            firstMaxSum = currentMaxSum;
        }
        return firstMaxSum;
    }

    public static void main(String[] args) {
        int[] array = {7, 10, 12, 7, 9, 14};
//        int[] array = {75, 105, 120, 75, 90, 135};
        System.out.println(maxSubsetSumNoAdjacent1(array));
        System.out.println(maxSubsetSumNoAdjacent2(array));
    }
}
