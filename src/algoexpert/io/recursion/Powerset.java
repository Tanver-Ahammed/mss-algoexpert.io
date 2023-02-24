package algoexpert.io.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Powerset {

    // Time O(n*2^n) and Space O(1)
    public static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < (1 << array.size()); ++i) {
            List<Integer> result = new ArrayList<>();
            for (int j = 0; j < array.size(); ++j) {
                if (((1 << j) & i) > 0)
                    result.add(array.get(j));
            }
            results.add(result);
        }
        return results;
    }

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(new Integer[]{1, 2, 3});

        System.out.println(powerset(array));

    }

}
