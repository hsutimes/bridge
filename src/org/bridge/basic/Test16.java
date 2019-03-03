package org.bridge.basic;

import java.util.Scanner;

/**
 * 假设你现在正在爬楼梯，楼梯有 nn 级。每次你只能爬 11 级或者 22 级，那么你有多少种方法爬到楼梯的顶部？
 * <p>
 * 输入格式
 * <p>
 * 第一行输入一个整数 n(1≤n≤50)，代表楼梯的级数。
 * <p>
 * 输出格式
 * <p>
 * 输出爬到楼梯顶部的方法总数。
 * <p>
 * 样例输入
 * 5
 * 样例输出
 * 8
 *
 * 注：规定从一级到一级有0种走法。
 *
 * @author times
 * Time: 2017-11-14 23:38
 */
public class Test16 {

    public Test16() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n + 2];
        num[0] = 0;
        num[1] = 0;
        num[2] = 1;
        num[3] = 2;
        for (int i = 4; i <= n + 1; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(num[i + 1] + " ");
        }
    }
}
