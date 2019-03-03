package org.bridge.basic;

import java.util.Scanner;

/**
 * 对于大于 11 的数，如果除了 11 和它本身，它不能再被其它正整数整除，
 * 那么我们说它是一个质数。晓萌想判断一个数是不是质数，希望找你写个程序，帮助她进行判断。
 * <p>
 * 输入格式
 * <p>
 * 输入包括一行，为一个整数 N(1<N\leq 1000)N(1<N≤1000)，正是晓萌给出你让你判断的数字。
 * <p>
 * 输出格式
 * <p>
 * 输出包括一行，如果晓萌给出的整数 NN 为质数，那么输出YES；如果 NN 不是质数，那么输出NO。
 * <p>
 * 样例输入
 * <p>
 * 3
 * 样例输出
 * <p>
 * YES
 *
 * @author times
 * Time: 2017-11-15 12:59
 */
public class Test18 {

    public Test18() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean isPrime(int num) {
        int temp = num - 1;
        for (int i = 2; i <= temp; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
