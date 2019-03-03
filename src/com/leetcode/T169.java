package com.leetcode;

import java.util.Arrays;

/**
 * @author times
 * @file T169.java
 * @time 2019/3/1
 */
public class T169 {
    public T169() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement2(nums));
    }

    private int majorityElement2(int[] nums) {
        int current = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                current = num;
            }
            if (num == current) {
                count++;
            } else {
                count--;
            }
        }
        return current;
    }

    public int majorityElement(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length && nums[i] == nums[j]) {
                if (j - i + 1 > nums.length / 2) {
                    res = nums[i];
                }
                j++;
            }
        }
        return res;
    }
}
