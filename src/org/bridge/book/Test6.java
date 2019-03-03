package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * @file Test7.java
 * @time 2018/3/29 0029
 * <p>
 * 10
 * 8 5 9 2 6 3 7 1 10 4
 */
public class Test6 {
    static int S = 2000000000;
    static int MAX = 500000;
    static int[] x = new int[MAX / 2 + 2], y = new int[MAX / 2 + 2];
    static int count;

    public Test6() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        mergeSort(a, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n" + count);
    }

    static void mergeSort(int[] a, int left, int right) {
        if (right > left + 1) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid, right);
            merge(a, left, mid, right);
        }
    }

    static void merge(int[] a, int left, int mid, int right) {
        int n1, n2;
        n1 = mid - left;
        n2 = right - mid;
        x[n1] = S;
        y[n2] = S;
        for (int i = 0; i < n1; i++) {
            x[i] = a[left + i];
        }
        for (int i = 0; i < n2; i++) {
            y[i] = a[mid + i];
        }
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            if (x[i] <= y[j]) {
                a[k] = x[i++];
            } else {
                a[k] = y[j++];
            }
            count++;
        }
    }
}
