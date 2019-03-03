package com.lintcode.util;

import java.util.Random;

/**
 * @author times
 * @file Util.java
 * @time 2018/7/30 0030
 */
public class Util {

    public static int[] arrays(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        return arr;
    }

    public static int[] arrays(int n, int l) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(l);
        }
        return arr;
    }

    public static char[] chars(int n) {
        // 65 => A
        // 97 => a
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = (char) (new Random().nextInt(26) + 97);
        }
        return c;
    }
}
