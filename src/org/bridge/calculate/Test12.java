package org.bridge.calculate;

import java.util.*;

/**
 * @author times
 * Time: 2017-11-29 15:57
 */
public class Test12 {

    public Test12() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(fun(x, y));
    }

    // 6 4
    static int fun(int x, int y) {
        int a = x, b = y;
        int t;
        if (x == y) {
            return x;
        }
        if (x < y) {
            t = x;
            x = y;
            y = t;
        }
        while (y != 0) {
            int k = x % y;
            x = y;
            y = k;
        }
        return a * b / x;
    }
}
