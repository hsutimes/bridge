package org.bridge.calculate;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author times
 * @file Test16.java
 * @time 2018/7/29 0029
 */
public class Test16 {

    public Test16() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[4], b = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                a[j] = in.nextInt();
            }
            Arrays.sort(a);
            b[i] = a[3] * a[2] - a[1] * a[0];
        }
        for (int x : b) {
            System.out.println(x);
        }
    }
}
