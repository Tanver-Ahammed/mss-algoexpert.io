package algoexpert.io.strings;

public class ReverseWordsInString {

    // Time O(n) || space O(1)
    public String reverseWordsInString(String string) {
        // Write your code here.
        StringBuilder reverseWord = new StringBuilder();
        int len = string.length();
        StringBuilder builder = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            if (string.charAt(i) == ' ') {
                reverseWord.append(builder.reverse()).append(" ");
                builder = new StringBuilder();
            } else
                builder.append(string.charAt(i));
        }
        reverseWord.append(builder.reverse());
        return reverseWord.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInString().reverseWordsInString("AlgoExpert is best!"));
        System.out.println("iuhih");
    }
}
