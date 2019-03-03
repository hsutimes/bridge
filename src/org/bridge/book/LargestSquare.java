package org.bridge.book;

/**
 * @author times
 * @file LargestSquare.java
 * @time 2018/11/30
 * 最大中正方形面积
 */
public class LargestSquare {
    public LargestSquare() {
        int[][] arr = new int[][]{
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}
        };
        System.out.println(f(arr));
        System.out.println(maximalSquare(arr));
    }

    private int f(int[][] arr) {
        int a = arr.length, b = arr[0].length;
        int count = 0, r = 0, t = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                count = Math.min(a - i, b - j);
                for (int k = 1; k <= count; k++) {
                    t = t(arr, k, i, j);
                    if (t > r) {
                        r = t;
                    }
                }
            }
        }
        return r * r;
    }

    private int t(int[][] arr, int k, int i, int j) {
        for (int l = 0; l < k; l++) {
            for (int m = 0; m < k; m++) {
                if (arr[i + l][j + m] == 0) return -1;
            }
        }
        return k;
    }

    public int maximalSquare(int[][] matrix) {
        int ans = 0;
        int n = matrix.length, m;
        if (n > 0) m = matrix[0].length;
        else return ans;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            res[i][0] = matrix[i][0];
            ans = Math.max(res[i][0], ans);
            for (int j = 1; j < m; j++) {
                if (i > 0) {
                    if (matrix[i][j] > 0) {
                        res[i][j] = Math.min(res[i - 1][j], Math.min(res[i][j - 1], res[i - 1][j - 1])) + 1;
                    } else {
                        res[i][j] = 0;
                    }

                } else {
                    res[i][j] = matrix[i][j];
                }
                ans = Math.max(res[i][j], ans);
            }
        }
        return ans * ans;
    }

}
