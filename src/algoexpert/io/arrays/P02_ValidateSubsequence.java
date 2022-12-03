package algoexpert.io.arrays;


import java.util.List;
import java.util.Objects;

public class P02_ValidateSubsequence {

    // Time O(n) || space O(1)
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int index = 0;
        int len = sequence.size();
        for (Integer integer : array) {
            if (Objects.equals(integer, sequence.get(index))) {
                ++index;
                if (index == len)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
