package org.bridge.demo;

import java.util.Scanner;

/**
 * 顺时针螺旋填入
 * 从键盘输入一个整数（1~20）
 * 则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如：
 * 输入数字2，则程序输出：
 * 1 2
 * 4 3
 * 输入数字3，则程序输出：
 * 1 2 3
 * 8 9 4
 * 7 6 5
 * 输入数字4，则程序输出：
 * 1  2  3  4
 * 12 13 4  5
 * 11 16 15 6
 * 10 9  8  7
 *
 * @author times
 * Time: 2017-11-12 16:32
 */
public class Demo14 {

    public Demo14() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[][] = new int[n][n];
        int startIndex = 0, endIndex = n - 1, count = 1, e = 0;
        while (e <= n / 2) {
            for (int i = startIndex; i <= endIndex; i++) {
                array[e][i] = count++;
            }
            for (int i = startIndex + 1; i <= endIndex; i++) {
                array[i][n - 1 - e] = count++;
            }
            for (int i = endIndex - 1; i >= startIndex; i--) {
                array[n - 1 - e][i] = count++;
            }
            for (int i = endIndex - 1; i > startIndex; i--) {
                array[i][e] = count++;
            }

            startIndex++;
            endIndex--;
            e++;
        }
        print(array);
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
