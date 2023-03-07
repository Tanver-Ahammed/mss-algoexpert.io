package algoexpert.io.strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumCharactersForWords {

    public char[] minimumCharactersForWords(String[] words) {
        // Write your code here.
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>();
            for (Character c : word.toCharArray()) {
                temp.put(c, temp.getOrDefault(c, 0) + 1);
                if (!map.containsKey(c)) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                    sb.append(c);
                } else if (temp.get(c) > map.get(c)) {
                    map.put(c, map.get(c) + 1);
                    sb.append(c);
                }
            }
        }
        return sb.toString().toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(new MinimumCharactersForWords().minimumCharactersForWords
                (new String[]{"this", "that", "did", "deed", "them!", "a"}));
    }

}