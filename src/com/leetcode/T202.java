package com.leetcode;

import java.util.HashSet;

/**
 * @author times
 * @file T202.java
 * @time 2019/3/2
 */
public class T202 {
    public T202() {
        int n = 2;
        System.out.println(isHappy2(n));
    }

    public boolean isHappy(int n) {
        int res = n;
        HashSet<Integer> hash = new HashSet<>();
        while (res != 1) {
            hash.add(res);
            String s = String.valueOf(res);
            int[] a = new int[s.length()];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.valueOf(String.valueOf(s.charAt(i)));
            }
            res = 0;
            for (int i = 0; i < a.length; i++) {
                res += a[i] * a[i];
            }
            // System.out.println(res);
            if (hash.contains(res)) return false;
        }
        return true;
    }

    private boolean isHappy2(int n) {
        if (n < 10) return n == 1 || n == 7;
        int b = 0;
        while (n > 0) {
            b += (n % 10) * (n % 10);
            n /= 10;
        }
        return isHappy(b);
    }
}
