package org.bridge.basic;

import java.util.*;

/**
 * 给定一个年份，判断这一年是不是闰年。
 * <p>
 * 当以下情况之一满足时，这一年是闰年：
 * <p>
 * 1. 年份是4的倍数而不是100的倍数；
 * <p>
 * 2. 年份是400的倍数。
 * <p>
 * 其他的年份都不是闰年。
 *
 * @author times
 * Time: 2017-11-08 22:18
 */
public class Test4 {

    public static void main(String[] args) {
    }

    public Test4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
