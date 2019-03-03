package org.bridge.exam.test;

import java.util.*;

/**
 * 4
 * 2
 * 3
 *
 * @author times
 * Time: 2017-11-16 20:02
 */
public class Test4 {

    public Test4() {
        Scanner sc = new Scanner(System.in);
        int i, j, N;
        N = sc.nextInt();
        i = sc.nextInt();
        j = sc.nextInt();
        int x, y, t;
        x = i;
        y = j;
        for (int k = 1; k <= N; k++)
            System.out.print("(" + i + "," + k + ")");
        System.out.println();
        for (int k = 1; k <= N; k++)
            System.out.print("(" + k + "," + j + ")");
        System.out.println();
        x = i;
        y = j;
        for (int k = 0; k < N; k++) {
            if (x > 1 && x < N && y > 1 && y < N) {
                x--;
                y--;
            } else {
                break;
            }
        }
        for (int k = 1; k <= N; k++)
            if (x >= 1 && x <= N && y >= 1 && y <= N)
                System.out.print("(" + (x++) + "," + (y++) + ")");
        System.out.println();
        x = i;
        y = j;
        for (int k = 0; k < N; k++) {
            if (x > 1 && x < N && y > 1 && y < N) {
                x++;
                y--;
            } else {
                break;
            }
        }
        for (int k = 1; k <= N; k++)
            if (x >= 1 && x <= N && y >= 1 && y <= N)
                System.out.print("(" + (x--) + "," + (y++) + ")");
        System.out.println();
    }
}
