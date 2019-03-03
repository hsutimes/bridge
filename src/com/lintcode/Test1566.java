package com.lintcode;

/**
 * @author times
 * @file Test1566.java
 * @time 2018/12/9
 */
public class Test1566 {

    public Test1566() {
        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5},
                {8, 9, 12, 19, 110},
                {14, 15, 16, 18, 20}
        };
        // System.out.println(minimumDifference(arr));

        char[] p = {'a', 'b', 'c', 'd', 'e'};
        permute(p, 0);
    }

    public int minimumDifference(int[][] array) {
        // Write your code here
        int m = array.length, n = array[0].length;
        int min = Integer.MAX_VALUE;
        for (int l = 0; l < m - 1; l++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int t = Math.abs(array[l][i] - array[l + 1][j]);
                    if (t < min) min = t;
                }
            }
        }
        return min;
    }

    public void permute(char[] a, int i) {
        if (a == null || i < 0 || i > a.length) {
            return;
        }
        if (i == a.length) {
            System.out.println(new String(a));
        } else {
            for (int j = i; j < a.length; j++) {
                // 交换前缀,使之产生下一个前缀
                swap(a, i, j);
                permute(a, i + 1);
                // 将前缀换回来,继续做上一个的前缀排列
                swap(a, i, j);
            }
        }
    }

    private void swap(char[] a, int s, int i) {
        char t = a[s];
        a[s] = a[i];
        a[i] = t;
    }
}
