package com.leetcode;

/**
 * @author times
 * @file T242.java
 * @time 2019/3/3
 * @link https://leetcode-cn.com/problems/valid-anagram/
 */
public class T242 {

    public T242() {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count == s.length();
    }

    private boolean isAnagram(String s, String t) {
        int[] cntS = new int[256];
        int[] cntT = new int[256];
        for (char c : s.toCharArray()) {
            cntS[c]++;
        }
        for (char c : t.toCharArray()) {
            cntT[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (cntS[i] != cntT[i]) {
                return false;
            }
        }
        return true;
    }
}
