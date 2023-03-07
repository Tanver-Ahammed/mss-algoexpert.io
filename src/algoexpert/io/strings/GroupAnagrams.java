package algoexpert.io.strings;

import java.util.*;

public class GroupAnagrams {

    // Time O(n) || space O(1)
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] frequency = new char[26];
            for (char ch : word.toCharArray())
                frequency[ch - 'a']++;
            String key = new String(frequency);
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new ArrayList<>(Arrays
                .asList("cinema", "a", "flop", "iceman", "meacyne", "lofp", "olfp"))));
    }

}