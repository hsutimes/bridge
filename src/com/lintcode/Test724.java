package com.lintcode;

/**
 * @author times
 * @file Test724.java
 * @time 2018/12/16
 */
public class Test724 {

    public Test724() {
        int[] arr = new int[]{1, 5, 6, 15};
        System.out.println(findMin(arr));
    }

    public int findMin(int[] nums) {
        // write your code here
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            for (int i = sum / 2; i >= num; i--) {
                dp[i] |= dp[i - num];
            }
        }
        int i = 0;
        for (i = dp.length - 1; i >= 0; i--) {
            if (dp[i]) {
                break;
            }
        }
        return sum - 2 * i;
    }

}
