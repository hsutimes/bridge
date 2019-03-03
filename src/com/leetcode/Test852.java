package com.leetcode;

import java.util.Arrays;

/**
 * @author times
 * @file Test852.java
 * @time 2018/9/23 0023
 * @link https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 */
public class Test852 {
    public Test852() {
        int[] arr = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public int peakIndexInMountainArray(int[] A) {
        int max = -1, n = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                n++;
            }
        }
        return n - 1;
    }
}
