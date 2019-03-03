package org.bridge.calculate.test1;

import java.util.Scanner;

/**
 * @author times
 * @file Test1.java
 * @time 2018/5/12 0012
 * 最长公共子序列
 * input:
 * 3
 * abcdefg
 * abcdef
 * abcd
 * bcd
 * abc
 * ab
 * output:
 * 5
 * 2
 * 1
 */
public class Test1 {
    static int N = 1000;

    public Test1() {
        String s1, s2;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] s = new int[3];
        for (int i = 0; i < n; i++) {
            s1 = in.next();
            s2 = in.next();
            s[i] = lcs(s1, s2);
        }
        for (int x : s) {
            System.out.println(x);
        }
    }

    static int lcs(String X, String Y) {
        int[][] c = new int[N + 1][N + 1];
        int maxl = 0, m = X.length(), n = Y.length();
        char[] x = X.toCharArray(), y = Y.toCharArray();
        for (int i = 1; i < m; i++)
            c[i][0] = 0;
        for (int i = 0; i < n; i++)
            c[0][i] = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (x[i] == y[j]) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                }
                maxl = Math.max(maxl, c[i][j]);
            }
        }
        return maxl;
    }
}
