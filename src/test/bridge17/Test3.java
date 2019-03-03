package test.bridge17;

import java.util.Scanner;

/**
 * @author times
 * @file Test3.java
 */
public class Test3 {

    public Test3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] dp = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int v = in.nextInt();
            int p = in.nextInt();
            for (int j = n; j >= v; j--) {
                dp[j] = Integer.max(dp[j], dp[j - v] + v * p);
            }
        }
        System.out.println(dp[n]);
    }
}
