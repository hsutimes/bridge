package com.lintcode;

/**
 * @author times
 * @file Test880.java
 * @time 2018/10/21 0021
 */
public class Test880 {

    public Test880() {
        String S = "y959q969u3hb22odq595";
        int K = 222280369;
        System.out.println(decodeAtIndex3(S, K));
    }

    private String decodeAtIndex2(String S, int K) {
        char[] c = S.toCharArray();
        long index = 0;
        int i = 0;
        for (; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                index++;
            } else {
                index = index * (c[i] - '0');
            }
        }
        while (i-- >= 0) {
            if (c[i] >= '2' && c[i] <= '9') {
                index = index / (c[i] - '0');
                K = K % (int) index;
            } else if (K % (int) index-- == 0) {
                return String.valueOf(c[i]);
            }
        }
        return "";
    }

    private boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    private String decodeAtIndex(String S, int K) {
        long si = 0;
        char[] c = S.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (isDigit(c[i])) {
                si *= c[i] - '0';
            } else {
                si++;
            }
        }
        for (int i = c.length - 1; i >= 0; i--) {
            K %= si;
            if (K == 0 && !isDigit(c[i])) {
                return String.valueOf(c[i]);
            }
            if (isDigit(c[i])) {
                si /= c[i] - '0';
            } else {
                si--;
            }
        }
        return "";
    }

    private String decodeAtIndex3(String S, int K) {
        char[] s = S.toCharArray();
        int n = s.length;
        long[] dp = new long[n + 1];
        for (int i = 0; i < n; i++) {
            if (s[i] >= '2' && s[i] <= '9')
                dp[i + 1] = dp[i] * (s[i] - '0');
            else
                dp[i + 1] = dp[i] + 1;
        }
        K--;
        for (int i = n - 1; i >= 0; i--) {
            K %= dp[i + 1];
            if (K + 1 == dp[i + 1] && !(s[i] >= '2' && s[i] <= '9'))
                return "" + s[i];
        }
        return null;
    }
}
