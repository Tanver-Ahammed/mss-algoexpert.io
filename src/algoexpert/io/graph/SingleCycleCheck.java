package algoexpert.io.graph;

public class SingleCycleCheck {

    public static boolean hasSingleCycle(int[] array) {
        // Write your code here.
        int numberOfElementVisited = 0;
        int currentIndex = 0;
        while (numberOfElementVisited < array.length) {
            if (numberOfElementVisited > 0 && currentIndex == 0)
                return false;
            numberOfElementVisited++;
            currentIndex = getNextIndex(currentIndex, array);
        }
        return currentIndex == 0;
    }

    private static int getNextIndex(int currentIndex, int[] array) {
        int jump = array[currentIndex];
        int nextIndex = (currentIndex + jump) % array.length;
        if (nextIndex >= 0)
            return nextIndex;
        return nextIndex + array.length;
    }

    public static void main(String[] args) {
        System.out.println(hasSingleCycle(new int[]{2, 3, 1, -4, -4, 2}));
    }

}
