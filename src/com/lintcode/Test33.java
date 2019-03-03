package com.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author times
 * @file Test33.java
 * @time 2018/10/14 0014
 */
public class Test33 {

    public Test33() {
        System.out.println(solveNQueens(4));
    }

    private char[][] cur;
    private boolean[] cols;
    private boolean[] diag1;
    private boolean[] diag2;

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        if (n <= 0) {
            return solutions;
        }

        cols = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];
        cur = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(cur[i], '.');
        }

        helper(n, 0, solutions);
        return solutions;
    }

    private boolean available(int x, int y, int n) {
        return !cols[y]
                && !diag1[x + y]
                && !diag2[y - x + n - 1];
    }

    private void updateCur(int x, int y, int n, boolean b) {
        cols[y] = b;
        diag1[x + y] = b;
        diag2[y - x + n - 1] = b;
        cur[x][y] = b ? 'Q' : '.';
    }

    private List<String> formatOutput(char[][] cur) {
        List<String> board = new ArrayList<String>();
        for (char[] ca : cur) {
            String colStr = String.valueOf(ca);
            board.add(colStr);
        }
        return board;
    }

    private void helper(int n, int x, List<List<String>> solutions) {
        if (x == n) {
            solutions.add(formatOutput(cur));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!available(x, i, n)) {
                continue;
            }
            updateCur(x, i, n, true);
            helper(n, x + 1, solutions);
            updateCur(x, i, n, false);
        }
    }
}