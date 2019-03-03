package org.bridge.demo;

import java.util.Scanner;

/**
 * 斐波那契数列是一种非常有意思的数列，
 * 由 00 和 11 开始，之后的斐波那契
 * 系数就由之前的两数相加。
 *
 * @author times
 * Time: 2017-11-07 00:08
 */
public class Test2 {

    static int fib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return (fib(n - 1) % 10007 + fib(n - 2) % 10007) % 10007;
    }

    // public static void main(String[] args) {
    public Test2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 1, f2 = 1, f3 = 0;
        if (n < 3) {
            System.out.print("1");
            return;
        }
        for (int i = 3; i <= n; i++) {
            if (f1 > 10007)
                f1 = f1 % 10007;
            if (f2 > 10007)
                f2 = f2 % 10007;
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.print(f3 % 10007);
    }
}