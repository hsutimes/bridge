package org.bridge.calculate;

import java.util.Scanner;

/**
 * @author times
 * @file Test15.java
 * @time 2018/7/23 0023
 * <p>
 * 给定一个非负整数数组，假定你的初始位置为数组第一个下标。
 * <p>
 * 数组中的每个元素代表你在那个位置能够跳跃的最大长度。
 * <p>
 * 请确认你是否能够跳跃到数组的最后一个下标。
 * <p>
 * 例如：A = [2,3,1,1,4]A=[2,3,1,1,4] 能够跳跃到最后一个下标，输出true；
 * <p>
 * A = [3,2,1,0,4]A=[3,2,1,0,4] 不能跳跃到最后一个下标，输出false。
 * <p>
 * 输入格式
 * 第一行输入一个正整数 n(1≤n≤500)，接下来的一行 nn 个整数，输入数组 Ai
 * <p>
 * 输出格式
 * 如果能跳到最后一个下标，输出true，否则输出false。
 * <p>
 * 样例输入
 * 5
 * 2 0 2 0 1
 * 样例输出
 * true
 */
public class Test15 {

    public Test15() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(f(a));
    }

    static boolean f(int[] a) {
        int l = a.length, t = 0;
        int[] x = new int[l];
        x[0] = 1;
        for (int i = 0; i < l; i++) {
            if (x[i] == 0) continue;
            for (int j = i + 1; j <= i + a[i]; j++) {
                if (j >= l) break;
                x[j] = 1;
            }
        }
        return (x[l - 1] == 1) ? true : false;
    }
}
