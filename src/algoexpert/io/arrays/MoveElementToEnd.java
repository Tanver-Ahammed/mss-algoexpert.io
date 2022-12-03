package algoexpert.io.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {

    // Time O(n) || space O(1)
    public static List<Integer> moveElementToEnd1(List<Integer> array, int toMove) {
        // Write your code here.
        int index = 0;
        int updateArrIndex = 0;
        while (index < array.size()) {
            int temp = array.get(index);
            if (temp == toMove) {
            } else {
                array.set(updateArrIndex, temp);
                ++updateArrIndex;
            }
            ++index;
        }
        for (int i = updateArrIndex; i < array.size(); i++) {
            array.set(i, toMove);
        }
        return array;
    }

    // Time O(n) || space O(1) using swap
    public static List<Integer> moveElementToEnd2(List<Integer> array, int toMove) {
        // Write your code here.
        // [2, 1, 2, 2, 2, 3, 4, 2]
        int updateIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != toMove) {
                // swap
                int temp = array.get(i);
                array.set(i, array.get(updateIndex));
                array.set(updateIndex, temp);
                ++updateIndex;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(2);
        System.out.println(moveElementToEnd1(integers, 2));
        System.out.println();
        System.out.println(moveElementToEnd2(integers, 2));

    }
}
