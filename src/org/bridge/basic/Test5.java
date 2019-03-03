package org.bridge.basic;

import java.util.*;

/**
 * 问题描述
 * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 * <p>
 * 输入格式
 * 第一行包含一个整数n。
 * <p>
 * 第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
 * <p>
 * 第三行包含一个整数a，为待查找的数。
 * <p>
 * 输出格式
 * 如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
 * 样例输入
 * 6
 * 1 9 4 8 3 9
 * 9
 * 样例输出
 * 2
 * 数据规模与约定
 * 1 <= n <= 1000。
 *
 * @author times
 * Time: 2017-11-08 23:33
 */
public class Test5 {

    public static void main(String[] args) {
    }

    public Test5() {
        Scanner sc = new Scanner(System.in);
        int n, x, index = -1;
        n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == num[i]) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
    }
}
