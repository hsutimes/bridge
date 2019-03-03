package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * @file Test7.java
 * @time 2018/5/2 0002
 * 分割
 * 10
 * 5 8 5 6 4 2 3 1 1 5
 */
public class Test7 {
    static final int MAX = 100000;
    static int[] A = new int[MAX];

    public Test7() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        int a = partition(0, n - 1);
        for (int i = 0; i < n; i++) {
            if (i == a) {
                System.out.print("[" + A[i] + "] ");
            } else {
                System.out.print(A[i] + " ");
            }
        }
    }

    static int partition(int p, int r) {
        int i, j, t, x;
        x = A[r];
        i = p - 1;
        for (j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                t = A[i];
                A[i] = A[j];
                A[j] = t;
            }
        }
        t = A[i + 1];
        A[i + 1] = A[r];
        A[r] = t;
        return i + 1;
    }
}
