package com.jisuanke;

import java.util.Scanner;

/**
 * @author times
 * @file T1003.java
 * @time 2019/3/1
 */
public class T1003 {
    public T1003() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = 5;
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j < n / 2; j++) {
                System.out.print(" ");
            }
            for (int j = n / 2 + 1 - i; j <= n / 2 + 1; j++) {
                System.out.print(str);
            }
            for (int j = n / 2 + 1 - i; j < n / 2 + 1; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = n / 2; j >= n / 2 - i; j--) {
                System.out.print(" ");
            }
            for (int j = n / 2 - i; j > 0; j--) {
                System.out.print(str);
            }
            for (int j = n / 2 - i - 1; j > 0; j--) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
