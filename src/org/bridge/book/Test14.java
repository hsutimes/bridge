package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * @file Test14.java
 * @time 2018/7/12 0012
 */
public class Test14 {
    public Test14() {
        Scanner in = new Scanner(System.in);
        int N = 100;
        int[] p = new int[N + 1];
        int[][] m = new int[N + 1][N + 1];
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
            p[i + 1] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            m[i][i] = 0;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                int k = j + i - 1;
                m[j][k] = 21;
                for (int l = j; l <= k - 1; l++) {
                    m[j][k] = min(m[j][k], m[j][l] + m[l + 1][k] + p[j - 1] * p[l] * p[k]);
                }
            }
        }
        System.out.println(m[0][n]);
    }

    static int min(int a, int b) {
        return a <= b ? a : b;
    }
}
