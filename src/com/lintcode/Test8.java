package com.lintcode;

import com.lintcode.util.Util;

/**
 * @author times
 * @file Test8.java
 * @time 2018/8/23 0023
 */
public class Test8 {

    public Test8() {
        long start = System.currentTimeMillis();
        char[] str = Util.chars(10000000);
        int offset = 20;
        rotateString(str, offset);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }

    public void rotateString(char[] str, int offset) {
        char[] tem = str.clone();
        int l = str.length;
        offset %= l;
        for (int i = 0; i < l; i++) {
            if (i < offset) {
                tem[i] = str[l - offset + i];
            } else {
                tem[i] = str[i - offset];
            }
        }
        System.arraycopy(tem, 0, str, 0, l);
    }

    public void rotateString2(char[] str, int offset) {
        // write your code here
        if (str == null || str.length == 0)
            return;

        offset = offset % str.length;
        reverse(str, 0, str.length - offset - 1);
        reverse(str, str.length - offset, str.length - 1);
        reverse(str, 0, str.length - 1);
    }

    private void reverse(char[] str, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
    // 45564
}
