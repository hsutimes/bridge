package org.bridge.basic;

import java.util.Scanner;

/**
 * 问题描述
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 * <p>
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * <p>
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 * <p>
 * 输入格式
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * 输出格式
 * 输出n行，每个m个字符，为你的图形。
 * 样例输入
 * 5 7
 * 样例输出
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 数据规模与约定
 * 1 <= n, m <= 26。
 *
 * @author times
 * Time: 2017-11-12 12:12
 */
public class Test10 {

    // 4 6
    // 012345
    // 101234
    // 210123
    // 321012
    public Test10() {
        Scanner sc = new Scanner(System.in);
        int n, m, x;
        n = sc.nextInt();
        m = sc.nextInt();
        int s = (int) 'A';
        boolean bool = true;
        for (int i = 0; i < n; i++) {
            x = i;
            for (int j = 0; j < m; j++) {
                System.out.print((char) (s + x));
                if (x > 0 && bool) x--;
                else bool = false;
                if (!bool) x++;
            }
            bool = true;
            System.out.println();
        }
    }
}
