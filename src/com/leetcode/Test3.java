package com.leetcode;

/**
 * @author times
 * @file Test3.java
 * @time 2018/11/30
 */
public class Test3 {

    public Test3() {
        String s = "pwwkew";
        // System.out.println(lengthOfLongestSubstring(s));
        // System.out.println(lengthOfLongestSubstring2(s));
        System.out.println(lengthOfLongestSubstring3(s));
    }

    private int lengthOfLongestSubstring(String s) {
        int[] cnt = new int[256];
        char[] c = s.toCharArray();
        int ans = 0, l = 0;
        for (int r = 0; r < s.length(); r++) {
            cnt[c[r]]++;
            while (cnt[c[r]] > 1) {
                cnt[c[l]]--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    private int lengthOfLongestSubstring2(String s) {
        int[] map = new int[256];
        int i = 0, j = 0;
        int ans = 0;
        for (i = 0; i < s.length(); i++) {
            while (j < s.length() && map[s.charAt(j)] == 0) {
                map[s.charAt(j)] = 1;
                ans = Math.max(ans, j - i + 1);
                j++;
            }
            map[s.charAt(i)] = 0;
        }
        return ans;
    }

    public int lengthOfLongestSubstring3(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
