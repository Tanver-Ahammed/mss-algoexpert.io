package algoexpert.io.strings;

import java.util.*;
import java.util.stream.Collectors;

public class Semordnilap {

    //----------------------------------------------method-1--------------------------------------------------------------------
    // duplicate check
    private boolean isDuplicate(String st1, String st2) {
        int len = st1.length();
        for (int i = 0; i < len; i++) {
            if (st1.charAt(i) != st2.charAt(len - 1 - i)) return false;
        }
        return true;
    }

    // Time O(n^3) || space O(n)
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        // Write your code here.
        ArrayList<ArrayList<String>> stringPairs = new ArrayList<>();
        Set<String> wordSet = new LinkedHashSet<>(Arrays.stream(words).collect(Collectors.toList()));
        List<String> wordList = new ArrayList<>(wordSet);
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).length() == wordList.get(j).length()) {
                    boolean flag = isDuplicate(wordList.get(i), wordList.get(j));
                    if (flag) {
                        ArrayList<String> tempList = new ArrayList<>();
                        tempList.add(wordList.get(i));
                        tempList.add(wordList.get(j));
                        stringPairs.add(tempList);
                    }
                }
            }
        }
        return stringPairs;
    }

    //----------------------------------------------method-2--------------------------------------------------------------------
    // Time O(n) || space O(n)
    public ArrayList<ArrayList<String>> semordnilap1(String[] words) {
        // Write your code here.
        ArrayList<ArrayList<String>> stringPairs = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            String reverse = reverseWord(word);
            if (wordSet.contains(reverse)) {
                ArrayList<String> tempList = new ArrayList<>();
                tempList.add(reverse);
                tempList.add(word);
                stringPairs.add(tempList);
                wordSet.remove(reverse);
            } else wordSet.add(word);
        }
        return stringPairs;
    }

    private String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Semordnilap().semordnilap1(new String[]
                {"liver", "dog", "hello", "desserts", "evil", "test", "god", "stressed", "racecar", "palindromes", "semordnilap", "abcd", "live"}));
    }


}
