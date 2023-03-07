package algoexpert.io.strings;

import java.util.ArrayList;

public class ValidIPAddresses {

    public ArrayList<String> validIPAddresses(String string) {
        // Write your code here.
        ArrayList<String> ips = new ArrayList<>();
        for (int i = 0; i < string.length() - 3; i++) {
            for (int j = i + 1; j < string.length() - 2; j++) {
                for (int k = j + 1; k < string.length() - 1; k++) {
                    String p1 = string.substring(0, i + 1);
                    String p2 = string.substring(i + 1, j + 1);
                    String p3 = string.substring(j + 1, k + 1);
                    String p4 = string.substring(k + 1);
                    if (isValidIPPart(p1) && isValidIPPart(p2) && isValidIPPart(p3) && isValidIPPart(p4))
                        ips.add(p1 + '.' + p2 + '.' + p3 + '.' + p4);
                }
            }
        }
        return ips;
    }

    private boolean isValidIPPart(String part) {
        return Integer.parseInt(part) < 256 &&
                (part.length() > 1 && part.charAt(0) != '0' || part.length() == 1);
    }

    public static void main(String[] args) {
        System.out.println(new ValidIPAddresses().validIPAddresses("1921680"));
    }

}
