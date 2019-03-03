package com.lintcode;

import com.lintcode.util.Util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author times
 * @file Test5.java
 * @time 2018/7/30 0030
 * @link https://www.lintcode.com/problem/kth-largest-element/description
 */
public class Test5 {

    public Test5() {
        long start = System.currentTimeMillis(), end;
        int k = 1;
        int n = 10;
        int[] nums = Util.arrays(n);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(kthLargestElement(k, nums));
        end = System.currentTimeMillis();
        System.out.println("\n" + (end - start) + "ms");
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }

    public int kthLargestElement(int k, int[] nums) {
        return quickSort(nums, 0, nums.length - 1, k);
    }

    public int quickSort(int[] nums, int left, int right, int k) {
        int i = left;
        int j = right;
        int t = nums[i];
        while (i < j) {
            while (i < j && t >= nums[j]) j--;
            if (i < j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && t < nums[i]) i++;
            if (i < j) {
                nums[j] = nums[i];
                j--;
            }
        }
        if (i == k - 1) {
            return t;
        } else if (i < k - 1) {
            return quickSort(nums, i + 1, right, k);
        } else {
            return quickSort(nums, left, i - 1, k);
        }
    }
}
