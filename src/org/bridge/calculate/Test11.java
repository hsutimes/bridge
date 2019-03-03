package org.bridge.calculate;

import java.util.Scanner;

/**
 * 设计函数int sqrt(int x)，计算 xx 的平方根。
 * <p>
 * 输入格式
 * <p>
 * 输入一个 整数 xx，输出它的平方根。直到碰到文件结束符（EOF）为止。
 * <p>
 * 输出格式
 * <p>
 * 对于每组输入，输出一行一个整数，表示输入整数的平方根。
 *
 * @author times
 * Time: 2017-11-24 17:11
 */
public class Test11 {

    public Test11() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == -1) return;
            System.out.println(sqrt(n));
        }
    }

    static int sqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int low = 0;
        int high = x / 2 + 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            long s1 = (long) mid * (long) mid;
            if (s1 == x) {
                return mid;
            } else if (s1 < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
}
