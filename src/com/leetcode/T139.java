package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author times
 * @file T139.java
 * @time 2019/3/3
 */
public class T139 {

    public T139() {
        String s = "leetcode";
        List<String> dict = new LinkedList<>();
        dict.add("leet");
        dict.add("code");
        System.out.println(wordBreak2(s, dict));
    }

    private int getMaxLength(List<String> dict) {
        int maxLength = 0;
        for (String word : dict) {
            maxLength = Math.max(maxLength, word.length());
        }
        return maxLength;
    }

    public boolean wordBreak(String s, List<String> dict) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int maxLength = getMaxLength(dict);
        boolean[] canSegment = new boolean[s.length() + 1];

        canSegment[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            canSegment[i] = false;
            for (int lastWordLength = 1;
                 lastWordLength <= maxLength && lastWordLength <= i;
                 lastWordLength++) {
                if (!canSegment[i - lastWordLength]) {
                    continue;
                }
                String word = s.substring(i - lastWordLength, i);
                if (dict.contains(word)) {
                    canSegment[i] = true;
                    break;
                }
            }
        }

        return canSegment[s.length()];
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        // 可以类比于背包问题
        int n = s.length();
        int max_length = 0;
        for (String temp : wordDict) {
            max_length = temp.length() > max_length ? temp.length() : max_length;
        }
        // memo[i] 表示 s 中以 i - 1 结尾的字符串是否可被 wordDict 拆分
        boolean[] memo = new boolean[n + 1];

        memo[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 0 && max_length >= i - j; j--) {
                if (memo[j] && wordDict.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[n];
    }
}
