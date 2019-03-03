package org.bridge.book;


import java.util.*;

/**
 * @author times
 * @file Test10.java
 * @time 2018/5/7 0007
 * 最小成本排序
 * input:
 * 5
 * 1 5 3 4 2
 * output:
 * 7
 */
public class Test10 {
    static final int MAX = 1000;
    static final int VMAX = 10000;
    int n, s;
    int[] A, B, T;

    public Test10() {
        A = new int[MAX];
        B = new int[MAX];
        T = new int[VMAX + 1];
        s = VMAX;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
            s = min(s, A[i]);
        }
        System.out.println(solve(n));
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    int solve(int n) {
        int ans = 0;
        boolean[] V = new boolean[MAX];
        for (int i = 0; i < n; i++) {
            B[i] = A[i];
            V[i] = false;
        }
        Arrays.sort(B);
        for (int i = 0; i < n; i++) {
            T[B[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            if (V[i]) continue;
            int cur = i, S = 0, m = MAX, an = 0;
            while (true) {
                V[cur] = true;
                an++;
                int v = A[cur];
                m = min(m, v);
                s += v;
                cur = T[v];
                if (V[cur]) break;
            }
            ans += min(S + (an - 2) * m, m + S + (an + 1) * s);
        }
        return ans;
    }
}
