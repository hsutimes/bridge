package com.lintcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author times
 * @file Test158.java
 * @time 2018/9/9 0009
 * @link https://www.lintcode.com/problem/valid-anagram/
 */
public class Test158 {

    public Test158() {
        String a = "abbd", b = "bacd";
        System.out.println(anagram2(a, b));
    }

    public boolean anagram(String s, String t) {
        char[] x = s.toCharArray(), y = t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return String.valueOf(x).equals(String.valueOf(y));
    }

    public boolean anagram2(String s, String t) {
        int[] cntS = new int[256];
        int[] cntT = new int[256];
        for (char c : s.toCharArray())
            cntS[c]++;
        for (char c : t.toCharArray())
            cntT[c]++;
        System.out.println();
        for (int i = 0; i < 256; i++)
            if (cntS[i] != cntT[i])
                return false;
        return true;
    }
}
