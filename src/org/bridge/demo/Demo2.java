package org.bridge.demo;

/**
 * 排列
 *
 * @author times
 * Time: 2017-11-06 22:59
 */
public class Demo2 {
    //    public static void main(String[] args) {
    public Demo2() {
        int num = function(5, 2);
        System.out.println(num);
    }

    public static int function(int n, int m) {
        if (n < m) return 0;
        if (n == m) return 1;
        if (m == 0) return 1;
        return function(n - 1, m - 1) + function(n - 1, m);
    }
}
