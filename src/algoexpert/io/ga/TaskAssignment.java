package algoexpert.io.ga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskAssignment {

    public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < 2 * k; i++)
            indices.add(i);
        Collections.sort(indices, Comparator.comparingInt(tasks::get));
        int i = 0, j = 2 * k - 1;
        while (i < j) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(indices.get(i));
            temp.add(indices.get(j));
            results.add(temp);
            ++i;
            --j;
        }
        return results;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 3, 5, 3, 1, 4));
        System.out.println(new TaskAssignment().taskAssignment(3, input));
    }

}
