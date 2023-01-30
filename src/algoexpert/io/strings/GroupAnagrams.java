package algoexpert.io.strings;

import java.util.*;

public class GroupAnagrams {

    // Time O(n) || space O(1)
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        List<List<String>> anagramGroup = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            List<String> tempList = new ArrayList<>();
            tempList.add(words.get(i));
            for (int j = i + 1; j < words.size(); j++) {
                String t = sortWord(words.get(j));
                if (!set.contains(t)) {
                    if (isEqualWord(words.get(i), words.get(j))) {
                        tempList.add(words.get(j));
                    }
                }
            }
            set.add(sortWord(words.get(i)));
            anagramGroup.add(tempList);
        }
        return anagramGroup;
    }

    private static boolean isEqualWord(String word1, String word2) {
        word1 = sortWord(word1);
        word2 = sortWord(word2);
        return word1.equals(word2);
    }

    private static String sortWord(String word) {
        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        return Arrays.toString(wordArray);
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new ArrayList<>(Arrays
                .asList("cinema", "a", "flop", "iceman", "meacyne", "lofp", "olfp"))));
    }

}