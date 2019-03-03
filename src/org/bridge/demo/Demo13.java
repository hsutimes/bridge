package org.bridge.demo;

/**
 * 方阵顺时针旋转
 * 对一个方阵转置，就是把原来的行号变列号，原来的列号变行号
 * 例如，如下的方阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 * 13 14 15 16
 * 转置后变为：
 * 1  5  9 13
 * 2  6 10 14
 * 3  7 11 15
 * 4  8 12 16
 * 但，如果是对该方阵顺时针旋转（不是转置），却是如下结果：
 * 13  9  5  1
 * 14 10  6  2
 * 15 11  7  3
 * 16 12  8  4
 *
 * @author times
 * Time: 2017-11-12 16:07
 */
public class Demo13 {

    public Demo13() {
        int[][] n = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        print(n);    // 显示原矩阵
        int len = n.length;
        int[][] m = new int[len][len];    // 目标矩阵
        rotation(n, m, 0, len - 1);    // 矩阵顺时针旋转
        System.out.println("顺时针旋转结果:");
        print(m);    // 显示目标矩阵
    }

    /**
     * 矩阵顺时针旋转
     * @param n
     * @param m
     * @param i
     * @param j
     */
    private static void rotation(int[][] n, int[][] m, int i, int j) {
        int t = j;    // 标记最后一行的位置
        if (i >= n.length) return;
        for (int k = 0; k < n.length; k++) {
            m[i][k] = n[j--][i];    // 解决一行***
        }
        rotation(n, m, ++i, t);    // 递归解决下一行
    }

    /**
     * 输出矩阵
     * @param t
     */
    private static void print(int[][] t) {
        for (int[] x : t) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
}
