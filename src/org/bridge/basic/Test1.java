package org.bridge.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-07 16:10
 */
public class Test1 {

    public Test1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
