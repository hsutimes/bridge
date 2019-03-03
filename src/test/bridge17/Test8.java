package test.bridge17;

import java.util.Scanner;

/**
 * @author times
 * @file Test8.java
 * @time 2018/11/14 0014
 */
public class Test8 {
    public Test8() {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = scan.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = scan.nextInt();
        System.out.println(maxCommonDivisor(num1, num2));
        System.out.println(minCommonMultiple(num1, num2));
    }

    // 递归法求最大公约数
    static int maxCommonDivisor(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {
            return n;
        } else {
            return maxCommonDivisor(n, m % n);
        }
    }

    // 循环法求最大公约数
    static int maxCommonDivisor2(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }

    // 求最小公倍数
    static int minCommonMultiple(int m, int n) {
        return m * n / maxCommonDivisor(m, n);
    }
}
