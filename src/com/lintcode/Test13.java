package com.lintcode;

/**
 * @author times
 * @file Test13.java
 * @time 2018/9/9 0009
 * @link https://www.lintcode.com/problem/implement-strstr/description
 */
public class Test13 {
    int count = 0;

    public Test13() {
        String a = "efghcdefghi", b = "efghi";
        System.out.println(strStr(a, b));
        System.out.println("count: " + count);
    }

    public int strStr(String source, String target) {
        // TODO write your code here
        if (source == null || target == null)
            return -1;
        int sl = source.length(), tl = target.length();
        for (int i = 0; i <= sl - tl; i++) {
            int j;
            for (j = 0; j < tl; j++) {
                count++;
                if (source.charAt(i + j) != target.charAt(j)) {
                    // 跳过已经作比较的字符
                    if (j > 1)
                        i += j - 1;
                    break;
                }
            }
            if (j == tl)
                return i;
        }
        return -1;
    }

    public int strStr2(String source, String target) {
        if (source == null || target == null)
            return -1;
        int sl = source.length(), tl = target.length();
        for (int i = 0; i <= sl - tl; i++) {
            if (source.substring(i, i + tl).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
