package org.bridge.calculate;

/**
 * @author times
 * @file Test14.java
 * @time 2018/3/15 0015 13:14
 * <p>
 * 设计一个算法，找出只含素因子2，3，5 的第 n 小的数。
 * <p>
 * 符合条件的数如：1, 2, 3, 4, 5, 6, 8, 9, 10, 12…
 * <p>
 * 注意事项
 * 我们可以认为1也是一个丑数
 * <p>
 * 样例
 * 如果n = 9， 返回 10
 */
public class Test14 {

    public Test14() {
        for (int i = 1; i <= 30; i++) {
            System.out.print(nthUglyNumber(i) + " ");
            /*if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0 && i % 3 == 0 ||
                        i % 2 == 0 && i % 5 == 0 ||
                        i % 3 == 0 && i % 5 == 0 ||
                        i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }*/
        }
    }

    /**
     * 第n个丑数
     *
     * @param n
     * @return
     */
    static int nthUglyNumber(int n) {
        int[] x = new int[n];
        int p2 = 0, p3 = 0, p5 = 0;
        x[0] = 1;
        for (int i = 1; i < n; i++) {
            x[i] = min(min(x[p2] * 2, x[p3] * 3), min(x[p2] * 2, x[p5] * 5));
            if (x[i] == x[p2] * 2) p2++;
            if (x[i] == x[p3] * 3) p3++;
            if (x[i] == x[p5] * 5) p5++;
        }
        return x[n - 1];
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    // 1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25 27 30 32 36 40 45 48 50 54 60 64 72 75 80
}
