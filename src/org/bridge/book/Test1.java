package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * @file Test1.java
 * @time 2018/3/21 0021 22:18
 * <p>
 * 样例输入
 * 5 3
 * 8
 * 1
 * 7
 * 3
 * 9
 * 样例输出
 * 10
 */
public class Test1 {
    static int n, k;
    static int[] t = new int[100000];

    static int check(int p) {
        int i = 0;
        for (int j = 0; j < k; j++) {
            int s = 0;
            while (s + t[i] <= p) {
                s += t[i];
                i++;
                if (i == 5) return n;
            }
        }
        return i;
    }

    static int sovle() {
        int x = 0, y = 100000 * 10000, mid;
        while ((y - x) > 1) {
            mid = (y + x) / 2;
            int v = check(mid);
            if (v >= n) y = mid;
            else x = mid;
        }
        return y;
    }

    public Test1() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        System.out.println(sovle());
    }
}
