package com.lintcode;

import java.util.*;

/**
 * @author times
 * @file Test171.java
 * @time 2018/9/9 0009
 * @link https://www.lintcode.com/problem/anagrams
 */
public class Test171 {

    public Test171() {
        String[] strs = new String[]{"", ""};
        System.out.println(anagrams(strs).size());
    }

    public List<String> anagrams(String[] strs) {
        // TODO write your code here
        List<String> result = new ArrayList<String>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = String.valueOf(arr);
            if (!map.containsKey(s)) {
                ArrayList<String> list = new ArrayList<String>();
                map.put(s, list);
            }
            map.get(s).add(str);
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }
}
