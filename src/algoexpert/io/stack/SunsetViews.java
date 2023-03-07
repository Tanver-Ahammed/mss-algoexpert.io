package algoexpert.io.stack;

import java.util.ArrayList;

public class SunsetViews {


    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        ArrayList<Integer> results = new ArrayList<>();
        int max = 0;
        if (direction.equals("EAST")) {
            for (int i = buildings.length - 1; i >= 0; i--) {
                if (buildings[i] > max) {
                    results.add(i);
                    max = buildings[i];
                }
            }
            for (int i = 0; i < results.size() / 2; i++) {
                int temp = results.get(i);
                results.set(i, results.get(results.size() - 1 - i));
                results.set(results.size() - 1 - i, temp);
            }
        } else {
            for (int i = 0; i < buildings.length; i++) {
                if (buildings[i] > max) {
                    results.add(i);
                    max = buildings[i];
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(
                new SunsetViews().sunsetViews(new int[]{3, 5, 4, 4, 3, 1, 3, 2}, "EAST1")
        );
    }

}
