package com.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author times
 * @file Test1472.java
 * @time 2018/10/4 0004
 * @link https://www.lintcode.com/problem/twins-strings/
 */
public class Test1472 {
    public Test1472() {
        System.out.println(isTwin2("abcd", "cbad"));
    }

    public String isTwin(String s, String t) {
        if (s == null && t == null) {
            return "Yes";
        }
        if (s == null || t == null) {
            return "No";
        }
        if (s.length() != t.length()) {
            return "No";
        }
        char[] cs = s.toCharArray(), ct = t.toCharArray();
        char[] csx, csy, ctx, cty;
        int tem = 0;
        String x = "", y = "";
        for (char c : cs) {
            if (tem == 0) {
                x += c;
                tem = 1;
            } else {
                y += c;
                tem = 0;
            }
        }
        csx = x.toCharArray();
        csy = y.toCharArray();
        tem = 0;
        x = "";
        y = "";
        for (char c : ct) {
            if (tem == 0) {
                x += c;
                tem = 1;
            } else {
                y += c;
                tem = 0;
            }
        }
        ctx = x.toCharArray();
        cty = y.toCharArray();
        int l = 127;
        int[] sx, sy, tx, ty;
        sx = new int[l];
        sy = new int[l];
        tx = new int[l];
        ty = new int[l];
        for (char c : csx) {
            sx[(int) c]++;
        }
        for (char c : csy) {
            sy[(int) c]++;
        }
        for (char c : ctx) {
            tx[(int) c]++;
        }
        for (char c : cty) {
            ty[(int) c]++;
        }
        for (int k = 0; k < l; k++) {
            if (sx[k] == 0 && tx[k] == 0) continue;
            if (sx[k] != tx[k]) {
                return "No";
            }
        }
        for (int o = 0; o < l; o++) {
            if (sy[o] == 0 && ty[o] == 0) continue;
            if (sy[o] != ty[o]) {
                return "No";
            }
        }
        return "Yes";
    }

    public String isTwin2(String s, String t) {
        if (s == null && t == null) {
            return "Yes";
        }

        if (s == null || t == null) {
            return "No";
        }

        // 不同长度，提早退出
        if (s.length() != t.length()) {
            return "No";
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i += 2) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i += 2) {
            int cnt = map.getOrDefault(t.charAt(i), 0);
            // 一旦出现0，那么肯定是t里面还有，s已经用光了
            if (cnt == 0) {
                return "No";
            }
            map.put(t.charAt(i), cnt - 1);
        }

        map = new HashMap<>();
        for (int i = 1; i < s.length(); i += 2) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 1; i < t.length(); i += 2) {
            int cnt = map.getOrDefault(t.charAt(i), 0);
            if (cnt == 0) {
                return "No";
            }
            map.put(t.charAt(i), cnt - 1);
        }
        return "Yes";
    }
}
