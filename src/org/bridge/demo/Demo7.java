package org.bridge.demo;

import java.math.BigInteger;

/**
 * 求21位数的水仙花数
 *
 * @author times
 * Time: 2017-11-12 15:24
 */
public class Demo7 {

    public Demo7() {
        long startTime = System.currentTimeMillis();    // 程序开始时间
        BigInteger pw[] = new BigInteger[10];
        for (int i = 0; i < pw.length; i++) {
            pw[i] = p(i);
        }
        int nn[] = new int[10];
        f(pw, nn, 0, 0);
        System.out.println("OK");
        long endTime = System.currentTimeMillis();  // 程序结束时间
        System.out.println((endTime - startTime) / 1000f + "秒");  // 运行总时间
    }

    // 求 每个 i 的 21 次方
    public static BigInteger p(int i) {
        BigInteger base = BigInteger.valueOf(i);
        return base.pow(21);
    }

    public static void ji_suan(BigInteger[] pw, int[] nn) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < 10; i++) {
            sum = sum.add(pw[i].multiply(BigInteger.valueOf(nn[i])));
        }
        String s = "" + sum;
        if (s.length() != 21) return;
        // 确定各数字出现的多少次
        int[] nn2 = new int[10];
        for (int i = 0; i < 21; i++) {
            nn2[s.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (nn[i] != nn2[i]) return;
        }
        System.out.println(s);
    }

    public static void f(BigInteger[] pw, int[] nn, int cur, int use) {
        if (cur == 9) {
            nn[9] = 21 - use;
            ji_suan(pw, nn);
            return;
        }
        // 对当前位置所有可能进行枚举
        for (int i = 0; i < 21 - use; i++) {
            nn[cur] = i;
            f(pw, nn, cur + 1, use + i);
        }
    }
}

