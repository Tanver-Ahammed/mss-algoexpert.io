package practise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            String st = scanner.next();
            int[] chars = new int[26];
            boolean flag = false;
            for (char ch : st.toCharArray()) {
                int index = (int) ch - 97;
                if (!flag) {
                    if (!set.contains(ch))
                        chars[index] = 0;
                    flag = true;
                } else {
                    chars[index] = 1;
                    flag = false;
                }
            }
        }

    }
}
