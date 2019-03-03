package com.lintcode;

/**
 * @author times
 * @file Test1544.java
 * @time 2018/12/5
 * @link https://zhuanlan.zhihu.com/p/29741357
 */
public class Test1544 {

    public Test1544() {
        int n = 3;
        int l = String.valueOf(n * n).length() + 1;
        int[][] arr;
        if (n % 2 == 0) {
            if (n % 4 == 0) {
                arr = magicSquare4(n);
            } else {
                arr = magicSquare2(n);
            }
        } else {
            arr = magicSquare(n);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%" + l + "d", arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 奇数阶幻方
     *
     * @param n
     * @return
     */
    private int[][] magicSquare(int n) {
        // Write your code here
        int[][] matrix = new int[n][n];
        matrix[0][(n - 1) / 2] = 1;
        int x = 0, y = (n - 1) / 2;
        for (int count = 2; count <= n * n; count++) {
            while (true) {
                x--;
                y++;
                while (true) {
                    if (x < 0) {
                        x += n;
                        continue;
                    }
                    if (y >= n) {
                        y -= n;
                        continue;
                    }
                    if (y < 0) {
                        y += n;
                        continue;
                    }
                    if (matrix[x][y] != 0) {
                        x += 2;
                        y -= 1;
                        if (x >= n) {
                            x -= n;
                            continue;
                        }
                        if (y < 0) {
                            y += n;
                            continue;
                        }
                        continue;
                    }
                    break;
                }
                matrix[x][y] = count;
                break;
            }
        }
        return matrix;
    }

    /**
     * 偶数阶幻方
     *
     * @param n
     * @return
     */
    private int[][] magicSquare4(int n) {
        int[][] a = new int[n][n];
        int i, j, k, row, column;

        // 填充二维数组
        for (row = 0, column = 0, i = 1; i <= n * n; i++) {
            a[row][column] = i;
            column = column + 1;
            if (column == n) {
                row = row + 1;
                column = 0;
            }
        }

        // 将4个小魔方阵的对角线上的数字替换成互补的数字
        for (k = n / 4, i = 0; i < n; i++) {
            if (i % 4 == 0 || i % 4 == 3) {
                for (j = 0; j < k; j++) {
                    a[i][4 * j] = n * n + 1 - a[i][4 * j];
                    a[i][4 * j + 3] = n * n + 1 - a[i][4 * j + 3];
                }
            } else {
                for (j = 0; j < k; j++) {
                    a[i][4 * j + 1] = n * n + 1 - a[i][4 * j + 1];
                    a[i][4 * j + 2] = n * n + 1 - a[i][4 * j + 2];
                }
            }
        }
        return a;
    }

    private int[][] magicSquare2(int n) {
        int[][] a = new int[n][n];
        int row, column, i, j, k, lastRow, lastColumn, temp;

        row = 0;
        column = n / 4;
        k = (n - 2) / 4;

        a[row][column] = 1;

        //填充A区域
        for (i = 2; i <= n * n / 4; i++) {
            lastRow = row;
            lastColumn = column;

            row = row - 1;
            column = column + 1;

            if (row < 0) {
                row = n / 2 - 1;
            }
            if (column == n / 2) {
                column = 0;
            }
            if (a[row][column] != 0) {
                row = lastRow + 1;
                column = lastColumn;
                if (row == n / 2) {
                    row = 0;
                }
            }

            a[row][column] = i;
        }

        // 复制到DBC区域
        for (i = 0; i < n / 2; i++) {
            for (j = 0; j < n / 2; j++) {
                a[i + n / 2][j] = a[i][j] + 3 * n * n / 4;
                a[i][j + n / 2] = a[i][j] + n * n / 2;
                a[i + n / 2][j + n / 2] = a[i][j] + n * n / 4;
            }
        }

        // 交换AC
        for (i = 0; i < n / 2; i++) {
            for (j = 0; j < k; j++) {
                if (i == n / 4) {
                    temp = a[n / 4][n / 4 + j];
                    a[n / 4][n / 4 + j] = a[3 * n / 4][n / 4 + j];
                    a[3 * n / 4][n / 4 + j] = temp;
                } else {
                    temp = a[i][j];
                    a[i][j] = a[i + n / 2][j];
                    a[i + n / 2][j] = temp;
                }
            }
        }

        // 交换BD
        if (k > 1) {
            for (i = 0; i < n / 2; i++) {
                for (j = 0; j < k - 1; j++) {
                    temp = a[i][3 * n / 4 - j];
                    a[i][3 * n / 4 - j] = a[i + n / 2][3 * n / 4 - j];
                    a[i + n / 2][3 * n / 4 - j] = temp;
                }
            }
        }
        return a;
    }
}
