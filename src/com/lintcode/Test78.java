package com.lintcode;

/**
 * @author times
 * @file Test78.java
 * @time 2018/9/9 0009
 */
public class Test78 {

    public Test78() {
        String[] strs = new String[]{"ABCD", "ABEF", "ABCEF"};
        System.out.println(longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "";
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
