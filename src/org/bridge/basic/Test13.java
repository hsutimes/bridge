package org.bridge.basic;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-13 21:55
 */
public class Test13 {

    public Test13() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
