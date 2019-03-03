package com.leetcode;

/**
 * @author times
 * @file Test463.java
 * @time 2018/12/5
 */
public class Test463 {

    public Test463() {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        // 16 = 4*7-2*6 = 28-12 = 16
        System.out.println(islandPerimeter(grid));
    }

    private int islandPerimeter(int[][] grid) {
        int a = 0, b = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 1) {
                    a++;
                    if (i + 1 < m && grid[i + 1][j] == 1) b++;
                    if (j + 1 < n && grid[i][j + 1] == 1) b++;
                }
        return a * 4 - b * 2;
    }

    public int islandPerimeter2(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count += 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        count -= 2;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        count -= 2;
                    }
                }

            }
        }
        return count;
    }
}
