package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * 逆序数
 * input:
 * 5
 * 3 5 2 1 4
 * output:
 * 6
 */
public class Test9 {
    static int S = 2000000000;
    static int MAX = 200000;
    static int[] x = new int[MAX / 2 + 2], y = new int[MAX / 2 + 2];

    public Test9() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(mergeSort(a, 0, n));
    }

    static long mergeSort(int[] a, int left, int right) {
        int mid;
        long v1, v2, v3;
        if (right > left + 1) {
            mid = (left + right) / 2;
            v1 = mergeSort(a, left, mid);
            v2 = mergeSort(a, mid, right);
            v3 = merge(a, left, mid, right);
            return v1 + v2 + v3;
        } else {
            return 0;
        }
    }

    static long merge(int[] a, int left, int mid, int right) {
        int n1, n2;
        long count = 0;
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
                count += n1 - i;
            }
        }
        return count;
    }
}
