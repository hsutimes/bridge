package org.bridge.mouni.jisuanb;

import java.util.Scanner;

/**
 * LIS是最长上升子序列。什么是最长上升子序列？ 就是给你一个
 * 序列，请你在其中求出一段最长严格上升的部分，它不一定要连续。
 * <p>
 * 就像这样：22, 33, 44, 77 和 22, 33, 44, 66 就是序列
 * 22 55 33 44 11 77 66 的两个上升子序列，最长的长度是 4。
 */
public class Test4 {

    public static final int N = 1000;
    public static int[] f = new int[N];
    public static int[] b = new int[N];

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int lis(int n) {
        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (b[j] < b[i]) {
                    /*在这里填写必要的代码*/
                    f[i] = max(f[i], f[j] + 1);
                }
            }
            res = max(res, f[i]);
        }
        return res + 1;
    }

    public Test4() {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 0; i < n; ++i) {
            b[i] = cin.nextInt();
        }
        System.out.println(lis(n));
    }
}
