package com.leetcode;

/**
 * @author times
 * @file T134.java
 * @time 2019/3/2
 */
public class T134 {

    public T134() {
        int[] gas = new int[]{5, 1, 2, 3, 4};
        int[] cost = new int[]{4, 4, 1, 5, 1};
        System.out.println(canCompleteCircuit2(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] < cost[i]) continue;
            int t = i;
            int gt = i;
            int n = gas[i];
            // System.out.print(n + " ");
            for (int j = 1; j < gas.length; j++) {
                if (n - cost[t] < 0) break;
                if (++gt >= gas.length) gt = 0;
                n = n - cost[t] + gas[gt];
                if (++t >= gas.length) t = 0;
                // System.out.print(n + " ");
            }
            // System.out.println();
            if (n >= cost[t]) return i;
        }
        return -1;
    }

    private int canCompleteCircuit2(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length == 0 || cost.length == 0) return -1;
        int sum = 0;
        int total = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (sum < 0) {
                index = i + 1;
                sum = 0;
            }
        }
        return total < 0 ? -1 : index;
    }
}
