package org.bridge.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 问题描述
 * 给出n个数，找出这n个数的最大值，最小值，和。
 * <p>
 * 输入格式
 * 第一行为整数n，表示数的个数。
 * <p>
 * 第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
 * <p>
 * 输出格式
 * 输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
 * 样例输入
 * 5
 * 1 3 -2 4 5
 * 样例输出
 * 5
 * -2
 * 11
 * 数据规模与约定
 * 1 <= n <= 10000。
 *
 * @author times
 * Time: 2017-11-12 12:43
 */
public class Test11 {

    public Test11() {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }
        Arrays.sort(num);
        System.out.println(num[n - 1]);
        System.out.println(num[0]);
        System.out.println(sum);
    }
}
