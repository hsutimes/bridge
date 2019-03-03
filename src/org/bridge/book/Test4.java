package org.bridge.book;

/**
 * @author times
 * @file Test4.java
 * @time 2018/3/22 0022 23:35
 */
public class Test4 {

    public Test4() {
        int[] a = new int[]{1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 5, 6, 6};
        int l = removeDuplicates(a);
        System.out.println(l);
        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static int removeDuplicates(int[] a) {
        int n = a.length, j = 0, x = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            if (a[j] != a[i]) {
                a[++j] = a[i];
                x = 0;
            } else {
                x++;
                if (x == 2) {
                    a[++j] = a[i];
                }
            }
        }
        return j + 1;
    }
}
