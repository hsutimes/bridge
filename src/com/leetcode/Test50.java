package com.leetcode;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author times
 * @file Test50.java
 * @time 2018/11/15 0015
 */
public class Test50 {

    public Test50() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        long s = System.currentTimeMillis();
        List<Long> l = productExcludeItself(list);
        System.out.println(l);
        System.out.println(System.currentTimeMillis() - s + " ms");
    }

    private List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        int len = nums.size();
        List<Long> B = new ArrayList<>();
        long[] f = new long[len];
        long tmp = 1;
        f[len - 1] = nums.get(len - 1);
        int i = 0;
        for (i = len - 2; i >= 0; --i) {
            f[i] = nums.get(i);
            f[i] = f[i] * f[i + 1];
        }
        for (i = 0; i < len; ++i) {
            if (i + 1 < len) {
                B.add(tmp * f[i + 1]);
            } else {
                B.add(tmp);
            }
            tmp = tmp * nums.get(i);
        }
        return B;
    }

    private List<Long> productExcludeItself2(List<Integer> nums) {
        List<Long> list = new ArrayList<>();
        int l = nums.size();
        for (int i = 0; i < l; i++) {
            long t = 1;
            for (int j = 0; j < l; j++) {
                if (i == j) continue;
                t *= nums.get(j);
            }
            list.add(t);
        }
        return list;
    }
}
