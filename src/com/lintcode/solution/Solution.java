package com.lintcode.solution;

/**
 * @author times
 * @file Solution.java
 * @time 2018/8/13 0013
 */
public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        int left = 0;
        int right = num.length - 1;

        if (num[left] < num[right]) {
            return num[left];
        }

        while (left < right - 1) {
            int mid = (right + left) / 2;
            if (num[mid] > num[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return num[right];
    }
}

