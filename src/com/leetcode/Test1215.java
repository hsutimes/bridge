package com.leetcode;

/**
 * @author times
 * @file Test1215.java
 * @time 2018/11/27
 */
public class Test1215 {
    public Test1215() {
        String s = "this is a test";
        System.out.println(s.split(" ").length);
        System.out.println(magicalString(100));
    }

    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;
        int num = 1, head = 2, tail = 3, res = 1;
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 2;
        a[2] = 2;
        while (tail < n) {
            for (int i = 0; i < a[head]; i++) {
                a[tail] = num;
                if (num == 1 && tail < n) {
                    res++;
                }
                tail++;
            }
            head++;
            num = num ^ 3;
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + "");
        }
        System.out.println();
        return res;
    }
}
