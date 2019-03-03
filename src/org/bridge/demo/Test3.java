package org.bridge.demo;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-07 14:46
 */
public class Test3 {
    static long fun(long n) {
        if (n == 1) return 1;
        return n + (fun(n - 1));
    }

    public Test3() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = (1 + n) * n / 2;
        System.out.println(s);
    }
}
