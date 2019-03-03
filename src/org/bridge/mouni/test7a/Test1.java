package org.bridge.mouni.test7a;

/**
 * 凑算式
 * <p>
 *      B      DEF
 * A + --- + ------- = 10
 *      C      GHI
 * <p>
 * （如果显示有问题，可以参见【图1.jpg】）
 * <p>
 * <p>
 * 这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。
 * <p>
 * 比如：
 * 6+8/3+952/714 就是一种解法，
 * 5+3/1+972/486 是另一种解法。
 * <p>
 * 这个算式一共有多少种解法？
 *
 * @author times
 * @file Test1.java
 * @time 2018/2/10 0010 23:42
 */
public class Test1 {

    public Test1() {
        int a = 10, num = 0;
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < a; j++) {
                if (j == i) continue;
                for (int k = 1; k < a; k++) {
                    if (k == j || k == i) continue;
                    for (int l = 1; l < a; l++) {
                        if (l == k || l == j || l == i) continue;
                        for (int m = 1; m < a; m++) {
                            if (m == l || m == k || m == j || m == i) continue;
                            for (int n = 1; n < a; n++) {
                                if (n == m || n == l || n == k | n == j || n == i) continue;
                                for (int o = 1; o < a; o++) {
                                    if (o == n || o == m || o == l || o == k || o == j || o == i) continue;
                                    for (int p = 1; p < a; p++) {
                                        if (p == o || p == n || p == m || p == l || p == k || p == j || p == i) continue;
                                        for (int q = 1; q < a; q++) {
                                            if (q == p || q == o || q == n || q == m || q == l || q == k || q == j || q == i) continue;
                                            int x, y;
                                            x = l * 100 + m * 10 + n;
                                            y = o * 100 + p * 10 + q;
                                            if ((i * k * y + j * y + x * k - 10 * k * y) == 0) {
                                                num++;
                                                System.out.println(i + "+" + j + "/" + k + "+"
                                                        + l + "" + m + "" + n + "/" + o + "" + p + "" + q + " = 10");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(num);
    }
}
