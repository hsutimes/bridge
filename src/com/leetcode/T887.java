package com.leetcode;

/**
 * @author times
 * @file T887.java
 * @time 2019/3/2
 */
public class T887 {

    public T887() {
        int K = 2, N = 6;
        System.out.println(superEggDrop2(K, N));
    }

    public int superEggDrop(int K, int N) {
        int res = 0;
        int[][] dp = new int[N + 2][K + 2];
        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < K + 2; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 0;
        for (int m = 1; m <= N; m++) {
            dp[m][0] = 0;
            for (int k = 1; k <= K; k++) {
                dp[m][k] = dp[m - 1][k] + dp[m - 1][k - 1] + 1;
                if (dp[m][k] >= N) {
                    return m;
                }
            }
        }
        return N;
    }

    public int superEggDrop2(int K, int N) {
        int[] dp = new int[K + 1];
        int step = 0;
        for (; dp[K] < N; step++) {
            for (int i = K; i > 0; i--)
                dp[i] += (1 + dp[i - 1]);
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        return step;
    }
}
