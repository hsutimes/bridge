package com.lintcode;

import java.util.Scanner;

/**
 * @author times
 * @file Test.java
 * @time 2018/7/31 0031
 * 8
 * ffcfffcffcff
 * cffcfff
 * cffcff
 * cffcf
 * ffffcffcfff
 * cffcfffcffffcfffff
 * cff
 * cffc
 */
public class Test {

    public Test() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i + 1) + ": " + f(in.next()));
        }
    }

    static int f(String s) {
        int l = s.length(), t = 0, x = 0, f = 0;
        if (l == 0) return -1;
        char[] c = s.toCharArray();
        for (int i = 0; i <= l; i++) {
            if (i == l) {
                if (x >= 2) {
                    t++;
                } else {
                    t = -1;
                }
                return t;
            }
            if (c[i] == 'c') {
                if (f == 1) {
                    if (x >= 2) {
                        t++;
                    } else {
                        return -1;
                    }
                }
                f = 1;
                x = 0;
            } else {
                if (f == 1) x++;
            }
        }
        return t;
    }
}
