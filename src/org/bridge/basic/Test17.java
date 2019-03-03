package org.bridge.basic;

import java.util.Scanner;

/**
 * 晓萌最近在做一个翻转图片的应用，你可能也知道，图片其实是由一个个的点组成的。
 * 于是，晓萌想先做一个可以翻转矩阵的程序，来解决他问题的核心部分。
 * <p>
 * 输入格式
 * <p>
 * 输入第一行包括由空格分开的整数 M,N,T(0 < N,M < 200)M,N,T(0<N,M<200)，
 * TT 的值为 0 或 1。其中 MM 和 NN 分别表示待处理矩阵的行数与列数，
 * TT 为 0 时表示左右翻转，为 1 时表示上下翻转。
 * <p>
 * 之后的 MM 行，每行包括由空格分隔的 NN 个整数，依次为输入矩阵的每一行的数据。
 * <p>
 * 输出格式
 * <p>
 * 输出包括 MM 行 NN 列，每个数字之间用一个空格分隔，每一行行末均有一个空格，表示的是按照要求翻转后的矩阵。
 * <p>
 * 样例输入
 * <p>
 * 4 4 1
 * 1 2 3 4
 * 5 6 7 8
 * 9 0 1 2
 * 3 4 5 6
 * 样例输出
 * <p>
 * 3 4 5 6
 * 9 0 1 2
 * 5 6 7 8
 * 1 2 3 4
 *
 * @author times
 * Time: 2017-11-15 00:15
 */
public class Test17 {

    public Test17() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[][] num = new int[m][n];
        int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = sc.nextInt();
                temp[i][j] = num[i][j];
            }
        }
        if (s == 1) {
            for (int i = 0; i < m; i++) {
                num[i] = temp[m - i - 1];
            }
        } else if (s == 0) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    num[i][j] = temp[i][n - j - 1];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
