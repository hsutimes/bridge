package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author times
 * @file Test830.java
 * @time 2018/11/13 0013
 */
public class Test830 {

    public Test830() {
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
    }

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> list =new ArrayList<>();
        List<Integer> l;
        char[] c=S.toCharArray();
        int start=0,end=0;
        while(end<c.length-1){
            if (c[end]==c[end+1]){
                end++;
            }else{
                if(end-start>=2){
                    l=new ArrayList<>();
                    l.add(start);
                    l.add(end);
                    list.add(l);
                }
                start=++end;
            }
        }
        if (end-start>=2){
            l=new ArrayList<>();
            l.add(start);
            l.add(end);
            list.add(l);
        }
        return list;
    }
}
