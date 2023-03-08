package algoexpert.io.arrays;

import java.util.*;

public class MergeOverlappingIntervals {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        if (intervals.length < 2)
            return intervals;
        List<int[]> results = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(array -> array[0]));
        int resultIndex = 0;
        results.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (results.get(resultIndex)[1] >= intervals[i][0])
                results.set(resultIndex, new int[]{results.get(resultIndex)[0], Math.max(results.get(resultIndex)[1], intervals[i][1])});
            else {
                resultIndex++;
                results.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        return results.toArray(new int[results.size()][]);
    }

}
