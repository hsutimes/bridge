package com.lintcode;

/**
 * @author times
 * @file Test1095.java
 * @time 2019/1/20
 * @link https://www.lintcode.com/problem/maximum-swap/description/
 */
public class Test1095 {

    public Test1095() {
        int num = 10;
        System.out.println(maximumSwap(num));
    }

    public int maximumSwap(int num) {
        // Write your code here
        char[] chars = String.valueOf(num).toCharArray();
        int n = chars.length;
        int index = n - 1, l = n - 1, r = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (chars[i] > chars[index]) {
                index = i;
            } else {
                l = i;
                r = index;
            }
        }
        char temp = chars[l];
        chars[l] = chars[r];
        chars[r] = temp;
        return Integer.parseInt(String.valueOf(chars));
    }
}
