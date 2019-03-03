package org.bridge.demo;

import java.util.Scanner;

/**
 * 汉诺塔递归实现
 *
 * @author times
 * Time: 2017-11-05 11:07
 */
public class Demo {
    static double count;

    public static void move(int n, char x, char y, char z) {
        if (n == 1) {
            System.out.println(x + "--->" + z);
        } else {
            move(n - 1, x, z, y);
            System.out.println(x + "--->" + z);
            move(n - 1, y, x, z);
        }
        count ++;
    }

    public Demo() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0 || num > 10) {
            System.out.println("num不合法");
        } else {
            move(num, 'A', 'B', 'C');
            System.out.println(count);
        }
    }
}
