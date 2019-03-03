package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * @file Test8.java
 * @time 2018/5/2 0002
 * 计数排序 (稳定排序)
 * input:
 * 10
 * 5 8 5 6 4 2 3 1 1 5
 * output:
 * 0 1 1 2 3 4 5 5 5 6
 */
public class Test8 {
    static final int MAX = 2000001;
    static final int VMAX = 10000;
    static int[] A, B, C;

    public Test8() {
        Scanner in = new Scanner(System.in);
        C = new int[VMAX + 1];
        for (int i = 0; i < VMAX + 1; i++) {
            C[i] = 0;
        }
        int n = in.nextInt();
        A = new int[n + 1];
        B = new int[n + 1];
        for (int i = 0; i < n; i++) {
            A[i + 1] = in.nextInt();
            C[A[i + 1]]++;
        }
        for (int i = 1; i < VMAX; i++) {
            C[i] += C[i - 1];
        }
        // 注释的语句为不稳定排序
        // for (int i = 1; i < = n; i--) {
        for (int i = n; i > 0; i--) {
            B[C[A[i]]] = A[i];
            C[A[i]]--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
