package com.leetcode;

/**
 * @author times
 * @file Test695.java
 * @time 2018/11/30
 */
public class Test695 {

    public Test695() {
        int[][] grid = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };
        System.out.println(maxAreaOfIsland(grid));
    }

    public int maxAreaOfIsland(int[][] grid) {
        int i, j, result = 0;
        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result = Math.max((countArea(grid, i, j)), result);
                }
            }
        }
        return result;
    }

    public int countArea(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) return 0;
        grid[i][j] = 0;
        return 1 + countArea(grid, i + 1, j) + countArea(grid, i - 1, j) + countArea(grid, i, j + 1) + countArea(grid, i, j - 1);
    }

}
