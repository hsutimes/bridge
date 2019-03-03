package com.lintcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author times
 * @file Test707.java
 * @time 2018/12/17
 */
public class Test707 {

    public Test707() {
        int[][] arr = new int[][]{{0, 1, 10}, {2, 0, 5}};
        System.out.println(balanceGraph(arr));
    }

    public int balanceGraph(int[][] edges) {
        // Write your code here
        Map<Integer, Integer> debt = new HashMap<>();
        // 预处理收支情况
        for (int[] t : edges) {
            debt.put(t[0], debt.getOrDefault(t[0], 0) - t[2]);
            debt.put(t[1], debt.getOrDefault(t[1], 0) + t[2]);
        }
        int[] account = new int[debt.size()];
        int len = 0;
        // 去除收支平衡的人
        for (int v : debt.values()) {
            if (v != 0) {
                account[len++] = v;
            }
        }
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[1 << len];
        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        // 枚举每个子集
        for (int i = 0; i < dp.length; i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < len; j++) {
                // 这个子集里有第j个人
                if ((1 << j & i) != 0) {
                    // 加上他的收支情况
                    sum += account[j];
                    // 平衡这个子集需要的最大交易数
                    count++;
                }
            }
            // 如果这个子集的收支平衡，那么它是一个子问题
            if (sum == 0) {
                // 这个子集需要的最大交易数
                dp[i] = count - 1;
                // 枚举这个子问题的子集
                for (int j = 1; j < i; j++) {
                    if (((i & j) == j) && dp[j] + dp[i - j] < dp[i]) {
                        // 求这个子问题的最优解
                        dp[i] = dp[j] + dp[i - j];
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
}
