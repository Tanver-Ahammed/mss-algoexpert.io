package algoexpert.io.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations {

    // Time O(n*n*n!) || space O(n*n!)
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        if (array.size() == 0)
            return new ArrayList<>();
        List<List<Integer>> allPermutations = new ArrayList<>();
        permutationsHelper(array, new ArrayList<Integer>(), allPermutations);
        return allPermutations;
    }

    private static void permutationsHelper(List<Integer> array, List<Integer> currentPermutations, List<List<Integer>> allPermutations) {
        if (array.size() == 0)
            allPermutations.add(currentPermutations);
        else {
            for (int i = 0; i < array.size(); i++) {
                List<Integer> newArray = new ArrayList<>();
                for (int j = 0; j < i; j++)
                    newArray.add(array.get(j));
                for (int j = i + 1; j < array.size(); j++)
                    newArray.add(array.get(j));
                List<Integer> newPermutation = new ArrayList<>(currentPermutations);
                newPermutation.add(array.get(i));
                permutationsHelper(newArray, newPermutation, allPermutations);
            }
        }
    }

    // Time O(n*n!) || space O(n*n!)
    public static List<List<Integer>> getPermutations2(List<Integer> array) {
        // Write your code here.
        if (array.size() == 0)
            return new ArrayList<>();
        List<List<Integer>> allPermutations = new ArrayList<>();
        permutationsHelper2(0, array, allPermutations);
        return allPermutations;
    }

    private static void permutationsHelper2(int index, List<Integer> array, List<List<Integer>> allPermutations) {
        if (index == array.size() - 1) {
            List<Integer> perm = new ArrayList<>(array);
            allPermutations.add(perm);
        } else {
            for (int j = index; j < array.size(); j++) {
                swap(array, index, j);
                permutationsHelper2(index + 1, array, allPermutations);
                swap(array, index, j);
            }
        }
    }

    private static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> array = Arrays.asList(arr);

        System.out.println(getPermutations2(array));

    }
}
