package com.lintcode;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author times
 * @file Test4.java
 * @time 2018/12/31
 * @link https://www.lintcode.com/problem/ugly-number-ii/
 */
public class Test4 {

    public Test4() {
        int n = 9;
        System.out.println(nthUglyNumber(n));
    }

    public int nthUglyNumber(int n) {
        if (n < 0) return -1;
        int[] nums = new int[n];
        nums[0] = 1;
        int c2 = 0, c3 = 0, c5 = 0;
        for (int i = 1; i < n; i++) {
            nums[i] = Math.min(Math.min(nums[c2] * 2, nums[c3] * 3), nums[c5] * 5);
            if (nums[i] == nums[c2] * 2) c2++;
            if (nums[i] == nums[c3] * 3) c3++;
            if (nums[i] == nums[c5] * 5) c5++;
        }
        return nums[n - 1];
    }
}
