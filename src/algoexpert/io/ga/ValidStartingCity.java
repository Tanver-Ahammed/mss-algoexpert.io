package algoexpert.io.ga;

public class ValidStartingCity {

    // Time O(n log n) || space O(1) using ga
    public int validStartingCity(int[] distances, int[] fuel, int mpg) {
        // Write your code here.
        int startingIndex = 0;
        int extraDistance = 0;
        for (int i = 0; i < distances.length; i++) {
            int localDistance = mpg * fuel[i] - distances[i];
            extraDistance += localDistance;
            if (localDistance < 0 && extraDistance < 0) {
                startingIndex = i + 1;
                extraDistance = 0;
            }
        }
        if (extraDistance >= 0)
            return startingIndex;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ValidStartingCity().validStartingCity(
                new int[]{30, 40, 10, 10, 17, 13, 50, 30, 10, 40},
                new int[]{1, 2, 0, 1, 1, 0, 3, 1, 0, 1},
                25)
        );

//        System.out.println(new ValidStartingCity().validStartingCity(
//                new int[]{5, 25, 15, 10, 15},
//                new int[]{1, 2, 1, 0, 3},
//                10)
//        );

//        System.out.println(new ValidStartingCity().validStartingCity(
//                new int[]{10, 10, 10, 10},
//                new int[]{1, 2, 3, 4},
//                4)
//        );


    }

}
