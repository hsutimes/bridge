package test.bridge17;

import java.util.Scanner;

/**
 * @author times
 * @file Test4.java
 */
public class Test4 {
    static char a = 'A';

    public Test4() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }

    static void solve(int n) {
        int l = 2 * n - 1;
        char[][] x = new char[l][l];
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = a++;
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                x[i][j] = '.';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    x[i + j * (n - 1 - i)][i + k * (n - 1 - i)] = c[i];
                }
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
