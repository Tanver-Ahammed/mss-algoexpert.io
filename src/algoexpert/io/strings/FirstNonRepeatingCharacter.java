package algoexpert.io.strings;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class FirstNonRepeatingCharacter {

    // Time O(n^2) || space O(1)
    // brute-force
    public int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        for (int i = 0; i < string.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) ++frequency;
            }
            if (frequency == 1)
                return i;
        }
        return -1;
    }

    // Time O(n) || space O(n)
    // hash
    public int firstNonRepeatingCharacter1(String string) {
        // Write your code here.
        Map<Character, Integer> integerMap = new HashMap<>();
        for (char ch : string.toCharArray()) {
            integerMap.put(ch, integerMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println(integerMap);
        for (int i = 0; i < string.length(); i++) {
            if (integerMap.get(string.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    // O(n) runtime and O(1) space No HashMap
    public int firstNonRepeatingCharacter2(String string) {
        // Write your code here.
        int[] frequencyArray = new int[26];
        for (char ch : string.toCharArray())
            frequencyArray[ch - 97]++;
        for (int i = 0; i < string.length(); i++) {
            if (frequencyArray[string.charAt(i) - 97] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstNonRepeatingCharacter()
                .firstNonRepeatingCharacter2("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void TestCase1() {
        String input = "abcdcaf";
        int expected = 1;
        var actual = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }

}
