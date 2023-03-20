package practise;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 0; i < n; i++) {
                int temp = scanner.nextInt();
                if (temp % 2 == 0)
                    evenSum += temp;
                else
                    oddSum += temp;
            }
            if (evenSum > oddSum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
