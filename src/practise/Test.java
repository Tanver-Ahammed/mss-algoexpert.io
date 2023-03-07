package practise;


import java.util.*;

public class Test {

    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        // Write your code here.
        if (arrayOne.size() == arrayTwo.size() && arrayOne.size() == 0)
            return true;
        if (!Objects.equals(arrayOne.get(0), arrayTwo.get(0)) || arrayOne.size() != arrayTwo.size())
            return false;
        arrayOne.remove(0);
        arrayTwo.remove(0);
        Collections.sort(arrayOne);
        Collections.sort(arrayTwo);
        for (int i = 0; i < arrayOne.size(); i++) {
            if (!Objects.equals(arrayOne.get(i), arrayTwo.get(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11));
        List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81));

        System.out.println(sameBsts(arrayOne, arrayTwo));

    }

}
