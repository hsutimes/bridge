package com.leetcode;

import java.util.Arrays;

/**
 * @author times
 * @file T163.java
 * @time 2019/3/1
 */
public class T163 {
    public T163() {
        int[] nums = new int[]{2, 2, 1};
        System.out.println(singleNumber2(nums));
    }

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    /**
     * 双指针扫描数组
     *
     * @param nums
     * @return
     */
    private int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] == nums[j]) {
                i += 2;
                j += 2;
            } else {
                break;
            }
        }
        if (i < nums.length && j < nums.length) {
            return nums[i];
        } else {
            return nums[j];
        }
    }
}
