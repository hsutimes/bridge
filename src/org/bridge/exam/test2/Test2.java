package org.bridge.exam.test2;

import java.util.Scanner;

/**
 * 小明开了一家糖果店。他别出心裁：把水果糖包成4颗一包和7颗一包的两种。糖果不能拆包卖。
 * 小朋友来买糖的时候，他就用这两种包装来组合。当然有些糖果数目是无法组合出来的，比如要买 10 颗糖。
 * 你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是17。大于17的任何数字都可以用4和7组合出来。
 * <p>
 * 本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字。
 * <p>
 * 输入格式
 * 两个正整数，表示每种包装中糖的颗数(都不多于1000)
 * 输出格式
 * 一个正整数，表示最大不能买到的糖数
 * 样例输入1
 * 4 7
 * 样例输出1
 * 17
 * 样例输入2
 * 3 5
 * 样例输出2
 * 7
 *
 * @author times
 * Time: 2017-11-29 23:55
 */
public class Test2 {

    public Test2() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x*y-x-y);
    }

    static void f(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = 0;
        int n[] = new int[x * y];
        for (int i = 0; i < n.length; i++)
            n[i] = i;
        for (int i = 0; i < x * y; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (j * x + k * y == i) {
                        n[i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 0) {
                if (n[i] > max)
                    max = n[i];
            }
        }
        System.out.println(max);
    }
}
