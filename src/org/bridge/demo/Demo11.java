package org.bridge.demo;

/**
 * 古堡算式
 * 福尔摩斯到某古堡探险，看到门上写着一个奇怪的算式：
 * ABCDE * ? = EDCBA
 * 他对华生说：“ABCDE应该代表不同的数字，问号也代表某个数字！”
 * 华生：“我猜也是！”
 * 于是，两人沉默了好久，还是没有算出合适的结果来。
 * 请你利用计算机的优势，找到破解的答案。
 * 把 ABCDE 所代表的数字写出来。
 *
 * @author times
 * Time: 2017-11-12 16:19
 */
public class Demo11 {

    public Demo11() {
        for (int i = 10000; i < 100000; i++) {
            int a = i / 10000;
            int b = i % 10000 / 1000;
            int c = i % 10000 % 1000 / 100;
            int d = i % 10000 % 1000 % 100 / 10;
            int e = i % 10;
            if (a == b || a == c || a == d || a == e ||
                    b == c || b == d || b == e ||
                    c == d || c == e ||
                    d == e) {
                continue;
            }
            int y = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
            if (y % i == 0) {
                System.out.println(i + " * " + y / i + " = " + y);
            }
        }
    }
}
