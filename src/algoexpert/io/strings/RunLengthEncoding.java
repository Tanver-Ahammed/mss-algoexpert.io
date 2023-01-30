package algoexpert.io.strings;

public class RunLengthEncoding {

    // fori loop
    public String runLengthEncoding(String string) {
        // Write your code here.
        StringBuilder encodingString = new StringBuilder();
        int charCount = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (charCount == 9) {
                encodingString.append(charCount).append(string.charAt(i));
                charCount = 0;
            }
            if (string.charAt(i) == string.charAt(i + 1)) {
                charCount++;
            } else {
                encodingString.append(++charCount).append(string.charAt(i));
                charCount = 0;
            }
        }
        ++charCount;
        if (charCount < 9)
            encodingString.append(charCount).append(string.charAt(string.length() - 1));
        else
            encodingString
                    .append(9)
                    .append(string.charAt(string.length() - 1))
                    .append(charCount - 9)
                    .append(string.charAt(string.length() - 1));

        return encodingString.toString();
    }

    // for-each loop
    public String runLengthEncoding1(String string) {
        // Write your code here.
        StringBuilder encodingString = new StringBuilder();
        char previousChar = string.charAt(0);
        short stringCounter = 0;
        for (char ch : string.toCharArray()) {
            if (stringCounter == 9 || previousChar != ch) {
                encodingString.append(stringCounter).append(previousChar);
                previousChar = ch;
                stringCounter = 0;
            }
            ++stringCounter;
        }
        encodingString.append(stringCounter).append(string.charAt(string.length() - 1));
        return encodingString.toString();
    }

    public static void main(String[] args) {
        RunLengthEncoding encoding = new RunLengthEncoding();
        System.out.println(encoding.runLengthEncoding1("AAAAABBBB"));
    }
}
