package algoexpert.io.sorting;

public class CountInversions {

    public int countInversions(int[] array) {
        // Write your code here.
        int pairCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    ++pairCounter;
            }
        }
        return pairCounter;
    }

    public static void main(String[] args) {

    }

}
