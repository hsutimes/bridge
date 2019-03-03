package com.lintcode;

/**
 * @author times
 * @file Test55.java
 * @time 2018/9/9 0009
 * @link https://www.lintcode.com/problem/compare-strings/description
 */
public class Test55 {

    public Test55() {
        String a = "ABCD", b = "ABC";
        System.out.println(compareStrings2(a, b));
    }

    public boolean compareStrings(String A, String B) {
        int[] a = new int[256], b = new int[256];
        for (char x : A.toCharArray())
            a[x]++;
        for (char x : B.toCharArray())
            b[x]++;
        for (int i = 0; i < 256; i++)
            if (a[i] < b[i])
                return false;
        return true;
    }

    /**
     * 速度更快
     *
     * @param A
     * @param B
     * @return
     */
    public boolean compareStrings2(String A, String B) {
        int[] t = new int[26];
        for (int i = 0; i < A.length(); i++)
            t[A.charAt(i) - 'A']++;
        for (int i = 0; i < B.length(); i++) {
            t[B.charAt(i) - 'A']--;
            if (t[B.charAt(i) - 'A'] < 0)
                return false;
        }
        return true;
    }
}
