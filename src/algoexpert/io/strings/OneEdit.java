package algoexpert.io.strings;

public class OneEdit {

    public boolean oneEdit(String stringOne, String stringTwo) {
        // Write your code here.
        int len1 = stringOne.length();
        int len2 = stringTwo.length();
        if (Math.abs(len1 - len2) > 1) return false;
        int count = 0;
        for (int i = 0; i < Math.min(len1, len2); i++) {
            if (stringOne.charAt(i) != stringTwo.charAt(i))
                ++count;
        }
        if (Math.abs(len1 - len2) == 1 && count > 0 &&
                stringOne.charAt(len1 - 1) == stringTwo.charAt(len2 - 1))
            return true;
        if (Math.abs(len1 - len2) == 1 && count > 0)
            return false;
        return count <= 1;
    }

    public static void main(String[] args) {

    }

}
