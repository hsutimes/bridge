package com.leetcode;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author times
 * @file Test220.java
 * @time 2018/10/10 0010
 */
public class Test220 {

    public Test220() {
        int[] arr = new int[]{1, 3, 2, 1};
        int k = 2, t = 1;
        System.out.println(containsNearbyAlmostDuplicate(arr, k, t));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0)
            return false;
        SortedSet<Long> binTree = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            SortedSet<Long> son = binTree.subSet((long) nums[i] - t, (long) nums[i] + t + 1);
            if (!son.isEmpty()) {
                return true;
            }
            if (i >= k) {
                binTree.remove((long) nums[i - k]);
            }
            binTree.add((long) nums[i]);
        }
        return false;
    }

    private boolean f(int[] nums, int k, int t) {
        if (k < 1 || t < 0) {
            return false;
        }
        SortedSet<Long> binTree = new TreeSet<>();
        SortedSet<Long> son;
        for (int i = 0; i < nums.length; i++) {
            son = binTree.subSet((long) nums[i] - t, (long) nums[i] + t + 1);
            if (!son.isEmpty()) {
                return true;
            }
            if (i >= k) {
                binTree.remove((long) nums[i - k]);
            }
            binTree.add((long) nums[i]);
        }
        return false;
    }
}
