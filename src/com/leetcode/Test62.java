package com.leetcode;

/**
 * @author times
 * @file Test62.java
 * @time 2019/1/17
 * @link https://leetcode-cn.com/problems/unique-paths/submissions/
 */
public class Test62 {

    public Test62() {
        System.out.println(uniquePaths(7, 3));
    }

    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 0;
        // 构造矩阵
        int[][] dp = new int[m][n];
        // 如果一个格子，则只有一种走法
        // 第一行只有一种走法
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        // 第一列只有一种走法
        for (int i = 1; i < n; i++) {
            dp[0][i] = 1;
        }
        // 其他的格子根据规律得出
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        // 打印矩阵
        /*for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }*/
        return dp[m - 1][n - 1];
    }
}
