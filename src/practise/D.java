package practise;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            while (q-- > 0) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int k = scanner.nextInt();
                int sum = 0;
                int diff = r - l + 1;
                int index = 0;
                while (index < n) {
                    if (index == l - 1)
                        index += diff;
                    else {
                        sum += arr[index];
                        ++index;
                    }
                }
                sum += diff * k;
                if (sum % 2 == 0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
