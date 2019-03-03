package org.bridge.exam.test2;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-29 23:47
 */
public class Test {

    public Test() {
        int count = 0;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= 9; j++) {
                if (j == i) continue;
                for (int k = 1; k <= 9; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 1; l <= 9; l++) {
                        if (l == i || l == j || l == k) continue;
                        for (int m = 1; m <= 9; m++) {
                            if (m == i || m == j || m == k || m == l) continue;
                            for (int n = 1; n <= 9; n++) {
                                if (n == i || n == j || n == k || n == l || n == m) continue;
                                for (int o = 1; o <= 9; o++) {
                                    if (o == i || o == j || o == k || o == l || o == m || o == n) continue;
                                    for (int p = 1; p <= 9; p++) {
                                        if (p == i || p == j || p == k || p == l || p == m || p == n || p == o)
                                            continue;
                                        for (int q = 1; q <= 9; q++) {
                                            if (q == i || q == j || q == k || q == l || q == m || q == n
                                                    || q == o || q == p)
                                                continue;
                                            if (i + ((j * 10000.0 + k * 1000.0 + l * 100.0 + m * 10.0 + n)
                                                    / (o * 100 + p * 10 + q)) == x
                                                    || i * 10 + j + ((k * 1000.0 + l * 100.0 + m * 10.0 + n)
                                                    / (o * 100 + p * 10 + q)) == x)
                                                count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        System.out.println(count);
    }
}
