package algoexpert.io.graph;

import java.util.Map;
import java.util.TreeMap;

public class QuickSelect {

    public static int quickselect(int[] array, int k) {
        // Write your code here.
        sort(array);
        int count = 1;
        for (int num : array) {
            if (count == k)
                return num;
            count++;
        }
        return -1;
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int j : arr) count.put(j, count.getOrDefault(j, 0) + 1);

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            for (int i = 0; i < value; i++)
                arr[index++] = key;

        }
    }

}
