package algoexpert.io.strings;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    // Time O(n) || space O(n)
    public boolean generateDocument(String characters, String document) {
        // Write your code here.
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char ch : characters.toCharArray()) {
            int temp = characterMap.getOrDefault(ch, 0);
            characterMap.put(ch, temp + 1);
        }

        for (char ch : document.toCharArray()) {
            int temp = 0;
            if (characterMap.containsKey(ch)) {
                temp = characterMap.getOrDefault(ch, 0);
                characterMap.put(ch, temp - 1);
            }
            if (temp == 0) return false;
        }
        return true;
    }

    // Time O(n) || space O(n)
    public boolean generateDocument1(String characters, String document) {
        // Write your code here.
        int[] chars = new int[128];
        for (char ch : characters.toCharArray())
            chars[ch]++;

        for (char ch : document.toCharArray()) {
            chars[ch]--;
            if (chars[ch] == -1) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
//        System.out.println(new GenerateDocument().generateDocument(characters, document));
        System.out.println(new GenerateDocument().generateDocument1(characters, document));
//        System.out.println(new GenerateDocument().generateDocument("aheaollabbhb", "hello"));
    }
}
