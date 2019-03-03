package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * @file Test5.java
 * @time 2018/3/26 0026
 * <p>
 * 样例输入
 * 5
 * 1 5 7 10 21
 * 4
 * 2 4 17
 * 阳历输出
 * no
 * no
 * yes
 * yes
 */
public class Test5 {
    static int[] t = new int[50];
    static int[] r = new int[200];

    public Test5() {
        Scanner in = new Scanner(System.in);
        int n, p;
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        p = in.nextInt();
        for (int i = 0; i < p; i++) {
            r[i] = in.nextInt();
        }
        for (int i = 0; i < p; i++) {
            String x = solve(0, r[i]) ? "yes" : "no";
            System.out.println(x);
        }
    }

    static boolean solve(int i, int n) {
        if (n == 0) return true;
        if (i >= n) return false;
        return (solve(i + 1, n) || solve(i + 1, n - t[i]));
    }
}
