package com.lintcode;

import java.util.*;

/**
 * @author times
 * @file Test362.java
 * @time 2018/7/30 0030
 * @link https://www.lintcode.com/problem/sliding-window-maximum/description
 */
public class Test362 {

    public Test362() {
        long start = System.currentTimeMillis(), end;
        int[] data = {1, 2, 7, 7, 2, 10, 3, 4, 5};
        int k = 2;
        ArrayList<Integer> a = maxSlidingWindow2(data, k);
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        end = System.currentTimeMillis();
        System.out.println("\n" + (end - start) + "ms");
    }

    public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] t = new int[k], temp = new int[k];
        int l = nums.length - k + 1, max = 0, loc = -1, in = 0;
        for (int i = 0; i < l; i++) {
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    t[j] = nums[j + i];
                }
                temp = t.clone();
                Arrays.sort(t);
                max = t[k - 1];
                loc = Arrays.binarySearch(temp, max) + i;
                arr.add(max);
                continue;
            }
            in = nums[i + k - 1];
            if (loc < i) {
                for (int j = 0; j < k - 1; j++) {
                    t[j] = nums[j + i];
                }
                t[k - 1] = 0;
                temp = t.clone();
                Arrays.sort(t);
                max = t[k - 1];
                loc = Arrays.binarySearch(temp, max) + i;
            }
            if (max <= in) {
                loc = i + k - 1;
                max = in;
            }
            arr.add(max);
        }
        return arr;
    }

    public ArrayList<Integer> maxSlidingWindow2(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && i - deque.peekFirst() >= k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }
        return result;
    }
}
