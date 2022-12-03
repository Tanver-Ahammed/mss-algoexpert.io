package algoexpert.io.strings;

public class PalindromeCheck {

    public static boolean isPalindrome1(String str) {
        // Write your code here.
        String reverseStr = String.valueOf(new StringBuffer(str).reverse());
        return str.equals(reverseStr);
    }

    public static boolean isPalindrome2(String str) {
        // Write your code here.
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return str.equals(reverseStr);
    }

    public static boolean isPalindrome3(String str) {
        // Write your code here.
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex))
                return false;
            ++leftIndex;
            --rightIndex;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1("abcdcba"));
        System.out.println(isPalindrome2("abcdcba"));
        System.out.println(isPalindrome3("abcdcba"));
    }

}
