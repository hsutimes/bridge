package org.bridge.exam.test2;

import java.util.Scanner;

/**
 * 根据输入的正整数n (米字形由一个(2n-1)*(2n-1)的矩阵组成，矩阵包含从大写A开始的n个字母
 * 　　例如:n=3时，包含A,B,C；n=4时，包含A,B,C,D。
 * 　　矩阵的正中间为n个字母中字典序最大的那个，从这个字母开始，沿着西北、正北、东北、正西、
 * 正东、西南、正南、东南八个方向各有一条由大写字母组成的直线。并且直线上的字母按字典序依次减小，直到大写字母A。
 * 　　矩阵的其它位置用英文句号．填充。
 * <p>
 * 　　样例输入一
 * 　　3
 * <p>
 * 　　样例输出一
 * 　　Ａ．Ａ．Ａ
 * 　　．ＢＢＢ．
 * 　　ＡＢＣＢＡ
 * 　　．ＢＢＢ．
 * 　　Ａ．Ａ．Ａ
 * <p>
 * 　　样例输入二
 * 　　4
 * <p>
 * 　　样例输出二
 * 　　Ａ．．Ａ．．Ａ
 * 　　．Ｂ．Ｂ．Ｂ．
 * 　　．．ＣＣＣ．．
 * 　　ＡＢＣＤＣＢＡ
 * 　　．．ＣＣＣ．．
 * 　　．Ｂ．Ｂ．Ｂ．
 * 　　Ａ．．Ａ．．Ａ
 *
 * @author times
 * Time: 2017-11-30 00:23
 */
public class Test4 {
    static char a = 'A';

    public Test4() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }

    static void solve(int n) {
        int l = 2 * n - 1;
        String[][] x = new String[l][l];
        String[] c = new String[n];
        for (int i = 0; i < n; i++) {
            c[i] = String.valueOf(a++)+" ";
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                x[i][j] = ". ";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    x[i + j * (n - 1 - i)][i + k * (n - 1 - i)] = c[i];
                }
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
