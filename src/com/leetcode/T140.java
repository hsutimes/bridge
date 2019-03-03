package com.leetcode;

import java.util.*;

/**
 * @author times
 * @file T140.java
 * @time 2019/3/3
 */
public class T140 {
    public T140() {
        String s = "pineapplepenapple";
        List<String> dict = new LinkedList<>();
        String[] strings = new String[]{"apple", "pen", "applepen", "pine", "pineapple"};
        for (String x : strings) {
            dict.add(x);
        }
        System.out.println(wordBreak2(s, dict));
    }

    public ArrayList<String> wordBreak(String s, List<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Map<String, ArrayList<String>> memo = new HashMap<String, ArrayList<String>>();
        return wordBreakHelper(s, dict, memo);
    }

    private ArrayList<String> wordBreakHelper(String s,
                                              List<String> dict,
                                              Map<String, ArrayList<String>> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        ArrayList<String> results = new ArrayList<String>();
        if (s.length() == 0) {
            return results;
        }
        if (dict.contains(s)) {
            results.add(s);
        }
        for (int len = 1; len < s.length(); ++len) {
            String word = s.substring(0, len);
            if (!dict.contains(word)) {
                continue;
            }
            String suffix = s.substring(len);
            ArrayList<String> segmentations = wordBreakHelper(suffix, dict, memo);
            for (String segmentation : segmentations) {
                results.add(word + " " + segmentation);
            }
        }
        memo.put(s, results);
        return results;
    }

    HashMap<String, List<String>> map = new HashMap<>();

    private List<String> wordBreak2(String s, List<String> wordDict) {
        List<String> list = new ArrayList<>();
        if (map.containsKey(s)) return map.get(s);
        if (s.equals("")) {
            list.add("");
            return list;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> res = wordBreak2(s.substring(word.length()), wordDict);
                for (String str : res) {
                    list.add(word + (str.equals("") ? "" : " ") + str);
                }
            }
        }
        map.put(s, list);
        return list;
    }
}
