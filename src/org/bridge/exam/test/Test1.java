package org.bridge.exam.test;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-16 22:11
 */
public class Test1 {

    public Test1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = sc.nextInt();
//        quickSort(num, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.println(num[i]);
    }

    static void fastSort(int[] a, int start, int end) {
        int i = start, j = end;
        if ((a == null) || (a.length == 0))
            return;
        while (i < j) {
            while (i < j && a[i] <= a[j])
                // 以数组start下标的数据为key，右侧扫描
                j--;
            if (i < j) { // 右侧扫描，找出第一个比key小的，交换位置
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            while (i < j && a[i] < a[j])
                // 左侧扫描（此时a[j]中存储着key值）
                i++;
            if (i < j) { // 找出第一个比key大的，交换位置
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        if (i - start > 1) { // 递归调用，把key前面的完成排序
            fastSort(a, 0, i - 1);
        }
        if (end - j > 1) {
            fastSort(a, j + 1, end); // 递归调用，把key后面的完成排序
        }
    }
}
