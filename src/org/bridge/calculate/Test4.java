package org.bridge.calculate;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-16 15:25
 */
public class Test4 {

    public Test4() {
        Scanner sc = new Scanner(System.in);
        int n, x;
        n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(aloneNum(num));
    }

    static int aloneNum(int[] num) {
        int n = num.length;
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = 0;
            for (int j = 0; j < n; j++) {
                if (num[i] == num[j])
                    x[i]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (x[i] == 1) {
                return num[i];
            }
        }
        return 0;
    }
}
