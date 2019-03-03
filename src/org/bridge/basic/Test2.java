package org.bridge.basic;

import java.util.*;

/**
 * @author times
 * Time: 2017-11-07 16:17
 */
public class Test2 {
    static int fun(int n, int k) {
        //n,行，k:列
        if (k == 1 || n == k) return 1;
        else return fun(n - 1, k - 1) + fun(n - 1, k);
    }

    // public static void main(String[] args) {
    public Test2() {
        int lines;
        Scanner sc = new Scanner(System.in);
        lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int k = 1; k < lines - i + 1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(fun(i, j) + "   ");
            }
            System.out.println();
        }
    }
}
