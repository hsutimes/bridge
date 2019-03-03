package com.leetcode;

/**
 * @author times
 * @file T125.java
 * @time 2019/3/3
 */
public class T125 {

    public T125() {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < s.length() && !isvalid(s.charAt(l))) {
                l++;
            }
            if (l == s.length()) return true;
            while (r >= 0 && !isvalid(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                break;
            } else {
                l++;
                r--;
            }
        }
        return r <= l;
    }

    private boolean isvalid(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

}
