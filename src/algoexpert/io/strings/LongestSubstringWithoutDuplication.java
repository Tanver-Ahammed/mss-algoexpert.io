package algoexpert.io.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplication {

    public static String longestSubstringWithoutDuplication(String str) {
        // Write your code here
        int lt = 0, rt = 0, n = str.length();
        int[] longest = new int[]{0, 0};
        Set<Character> window = new HashSet<>();
        while (rt < n) {
            if (!window.contains(str.charAt(rt))) {
                window.add(str.charAt(rt));
                rt++;
            } else {
                window.remove(str.charAt(lt));
                ++lt;
            }
            if (longest[1] - longest[0] < rt - lt)
                longest = new int[]{lt, rt};
        }
        return str.substring(longest[0], longest[1]);
    }

    public static void main(String[] args) {

    }

}
