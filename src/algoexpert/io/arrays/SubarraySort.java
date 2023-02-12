package algoexpert.io.arrays;

import java.util.Arrays;

public class SubarraySort {

    // Time O(n) || Space O(n) using array clone
    public static int[] subarraySort(int[] array) {
        // Write your code here.
        int firstIndex = -1;
        int lastIndex = -1;
        boolean flag = false;
        int[] cloneArr = array.clone();
        Arrays.sort(cloneArr);
        for (int i = 0; i < array.length; i++) {
            int v1 = array[i];
            int v2 = cloneArr[i];
            if ((v1 != v2) && !flag) {
                firstIndex = i;
                lastIndex = i;
                flag = true;
            } else if ((v1 != v2) && flag) {
                lastIndex = i;
            }
        }
        return new int[]{firstIndex, lastIndex};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subarraySort(new int[]{2, 1})));
    }

}
