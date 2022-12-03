package algoexpert.io.strings;

public class CaesarCipherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        String newString = "";
        key = key % 26;
        for (char ch : str.toCharArray()) {
            int asciiCode = ch + key;
            if (asciiCode > 122)
                asciiCode -= 26;
            newString += (char) asciiCode;
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("xyz", 2));
    }
}
