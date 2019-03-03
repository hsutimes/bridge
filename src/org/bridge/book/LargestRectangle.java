package org.bridge.book;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author times
 * @file LargestRectangle.java
 * @time 2018/11/30
 * 最大矩阵面积
 */
public class LargestRectangle {
    public LargestRectangle() {
        int[][] arr = new int[][]{
                {0, 0, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 0, 1},
        };
        System.out.println(maximalRectangle(arr));
    }

    public int maximalRectangle(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] height = new int[n + 1];
        height[n] = 0;

        int max = 0;
        for (int i = 0; i < m; i++) {
            //compute height
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1)
                    height[j]++;
                else
                    height[j] = 0;
            }
            //compute max area by height with stack
            Stack<Integer> s = new Stack<>();
            for (int j = 0; j <= n; j++) {
                if (s.isEmpty() || height[s.peek()] <= height[j])
                    s.push(j);
                else {
                    while (!s.isEmpty() && height[j] < height[s.peek()]) {
                        max = Math.max(max, height[s.pop()] * (s.isEmpty() ? j : (j - s.peek() - 1)));
                    }
                    s.push(j);
                }
            }
        }
        return max;
    }

}
