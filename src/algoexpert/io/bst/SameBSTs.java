package algoexpert.io.bst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameBSTs {

    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        // Write your code here.
        if (arrayOne.size() != arrayTwo.size())
            return false;

        Map<Integer, Integer> bst1 = toBSTMap(arrayOne);
        Map<Integer, Integer> bst2 = toBSTMap(arrayTwo);
        return bst1.equals(bst2);
    }

    private static Map<Integer, Integer> toBSTMap(List<Integer> array) {
        Map<Integer, Integer> bst = new HashMap<>();
        for (int num : array) {
            int j = 0;
            while (bst.containsKey(j)) {
                if (num >= bst.get(j))
                    j = 2 * j + 1;
                else
                    j = 2 * j + 2;
            }
            bst.put(j, num);
        }
        return bst;
    }

}
