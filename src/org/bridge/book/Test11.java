package org.bridge.book;

import java.util.*;

/**
 * @author times
 * @file Test11.java
 * @time 2018/7/12 0012
 * <p>
 * @url https://nanti.jisuanke.com/t/27644/
 * <p>
 * 贝壳找房的攻城狮最近在研究一次函数 f(x) = ax + bf(x)=ax+b。
 * 求 f(f(f(…f(x))…)f(f(f(…f(x))…) 的最大值。
 * <p>
 * 输入数据
 * 一个整数T(T≤20) 代表数据组数。
 * <p>
 * 输出数据
 * 为了使问题简化，对于每组数据只需要输出最大值的个位即可。（比如函数的值可能是 1919 或者 2323 ，但最终应该输出的是 33）。
 * 提示
 * 对于第一组数据，有 66 种情况
 * 3×(1×(2×7+3)+1)+2=56
 * 3×(2×(1×7+1)+3)+2=59
 * 1×(3×(2×7+3)+2)+1=54
 * 1×(2×(3×7+2)+3)+1=50
 * 2×(3×(1×7+1)+2)+3=55
 * 2×(1×(3×7+2)+1)+3=51
 * 所以输出 99
 * <p>
 * 样例输入
 * 2
 * 3 7
 * 3 1 2
 * 2 1 3
 * 3 2
 * 9 1 2
 * 9 1 2
 * 样例输出
 * 9
 * 1
 */
public class Test11 {

    public Test11() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long start = System.currentTimeMillis(), end;
        int n, x;
        int[] a, b;
        String[] z = new String[t];
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            x = in.nextInt();
            a = new int[n];
            b = new int[n];
            for (int j = 0; j < n; j++)
                a[j] = in.nextInt();
            for (int j = 0; j < n; j++)
                b[j] = in.nextInt();
            z[i] = sovle(x, a, b, n);
        }
        for (String v : z) {
            System.out.println(v);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }

    static String sovle(int x, int[] a, int[] b, int n) {
        int max = 0, num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) continue;
                    num = f(a[i], b[i], f(a[j], b[j], f(a[k], b[k], x)));
                    if (num > max) {
                        max = num;
                    }
                }
            }
        }
        String s = String.valueOf(max);
        return s.substring(s.length() - 1, s.length());
    }

    static int f(int a, int b, int x) {
        return a * x + b;
    }
}






