package org.bridge.exam.test;

import java.util.Scanner;

/**
 * 最小公倍数
 *
 * @author times
 * Time: 2017-11-16 18:33
 */
public class Test3 {

    public Test3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (i != j && j != k && i != k) {
                        y = i * j * k;
                        if (y > x) {
                            x = y;
                        }
                    }
                }
            }
        }
        System.out.println(x);
    }
}
