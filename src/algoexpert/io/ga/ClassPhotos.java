package algoexpert.io.ga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassPhotos {

    // Time O(n log n) || space O(1) using ga
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Write your code here.
        boolean isBlue = false;
        boolean isRed = false;
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (isBlue && isRed)
                return false;
            else if (redShirtHeights.get(i) > blueShirtHeights.get(i))
                isRed = true;
            else if (redShirtHeights.get(i) < blueShirtHeights.get(i))
                isBlue = true;
            else
                return false;
        }
        if (isBlue && isRed)
            return false;
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4, 9));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5, 1));
        System.out.println(new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights));
    }

}
