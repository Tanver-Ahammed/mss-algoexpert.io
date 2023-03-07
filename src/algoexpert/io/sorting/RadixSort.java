package algoexpert.io.sorting;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RadixSort {

    public ArrayList<Integer> radixSort1(ArrayList<Integer> array) {
        // Write your code here.
        for (int i = 0; i < 31; i++) {
            int mask = 1 << i;
            ArrayList<Integer> temp = new ArrayList<>();
            temp.addAll(array.stream().filter(a -> (a & mask) == 0).collect(Collectors.toList()));
            temp.addAll(array.stream().filter(a -> (a & mask) != 0).collect(Collectors.toList()));
            array = temp;
        }
        return array;
    }

    public ArrayList<Integer> radixSort(ArrayList<Integer> array) {
        // Write your code here.
        return redix(array);
    }

    private static ArrayList<Integer> redix(ArrayList<Integer> array) {
        int maxDigit = getMaxDigit(array);
        int i = 0;
        while (maxDigit > 0) {
            array = countingSort(array, i);
            maxDigit--;
            i++;
        }
        return array;
    }

    public static ArrayList<Integer> countingSort(ArrayList<Integer> arr, int sortDigit) {
        int[] count = new int[10];
        int[] output = new int[arr.size()];

        for (Integer a : arr)
            count[getDigit(a, sortDigit)] += 1;

        for (int i = 1; i < count.length; i++)
            count[i] = count[i] + count[i - 1];

        for (int i = arr.size() - 1; i >= 0; i--) {
            int d = getDigit(arr.get(i), sortDigit);
            count[d] = count[d] - 1;
            output[count[d]] = arr.get(i);
        }

        ArrayList<Integer> returnArray = new ArrayList<>(arr.size());
        for (int i = 0; i < output.length; i++)
            returnArray.add(i, output[i]);

        return returnArray;
    }

    private static int getDigit(Integer number, Integer sortDigit) {
        int r = 0;
        while (sortDigit > 0) {
            r = number % 10;
            number /= 10;
            sortDigit--;
        }
        return r;
    }

    private static int getMaxDigit(ArrayList<Integer> array) {
        int maxDigit = -1;
        for (Integer number : array) {
            int digit = getNoOfDigit(number);
            if (digit > maxDigit)
                maxDigit = digit;
        }
        return maxDigit;
    }

    private static int getNoOfDigit(Integer number) {
        int count = 1;
        while (number / 10 > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

}
