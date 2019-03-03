package org.bridge.book;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author times
 * @file Test13.java
 * @time 2018/7/12 0012
 */
public class Test13 {

    public Test13() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int x, y, o = 0;
        char[] c, d;
        c = str.toCharArray();
        d = c;
        int l = c.length;
        for (int i = 0; i < l; i++) {
            switch (c[i]) {
                case '0':
                case '2':
                case '5':
                case '8':
                case '1':
                    break;
                case '9':
                    c[i] = '6';
                    break;
                case '6':
                    c[i] = '9';
                    break;
                default:
                    o = 1;
                    break;
            }
        }
        if (o == 1) {
            System.out.println("no");
            return;
        }
        for (int i = 0; i < l; i++) {
            d[i] = c[l - i - 1];
        }
        int n = 0, m = 0;
        if (str.length() < 8) {
            n = Integer.valueOf(str);
            x = isPrime(n);
            m = Integer.valueOf(String.valueOf(d));
            y = isPrime(m);
        } else {
            BigInteger a = new BigInteger(str), b = new BigInteger(String.valueOf(d));
            if (!a.isProbablePrime(100)) {
                x = 1;
            } else {
                x = 0;
            }
            if (!b.isProbablePrime(100)) {
                y = 1;
            } else {
                y = 0;
            }
        }
        if (y == 1 && x == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public int isPrime(int num) {
        if (num == 2) return 1;
        if (num < 2 || num % 2 == 0) return 1;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
