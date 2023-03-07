package algoexpert.io.strings;

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
        boolean[][] dp = new boolean[str.length()][str.length()];
        int leftIndexOfLongestPalindromic = 0;
        int rightIndexOfLongestPalindromic = 0;
        for (int i = 0; i < str.length(); i++)
            dp[i][i] = true;
        for (int i = 0; i < str.length() - 1; i++) {
            int j = i + 1;
            dp[i][j] = str.charAt(i) == str.charAt(j);
            if (dp[i][j] && j - i > rightIndexOfLongestPalindromic - leftIndexOfLongestPalindromic) {
                leftIndexOfLongestPalindromic = i;
                rightIndexOfLongestPalindromic = j;
            }
        }
        for (int l = 2; l < str.length(); l++) {
            for (int i = 0; i < str.length() - l; i++) {
                int j = i + l;
                dp[i][j] = dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j);
                if (dp[i][j] && j - i > rightIndexOfLongestPalindromic - leftIndexOfLongestPalindromic) {
                    leftIndexOfLongestPalindromic = i;
                    rightIndexOfLongestPalindromic = j;
                }
            }
        }
        return str.substring(leftIndexOfLongestPalindromic, rightIndexOfLongestPalindromic + 1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abaxyzzyxf"));
    }

}
