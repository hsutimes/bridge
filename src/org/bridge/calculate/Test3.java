package org.bridge.calculate;

import java.util.Random;
import java.util.Scanner;

/**
 * 给定一个整数 num，将整数转换成罗马数字。
 * <p>
 * 如 1,2,3,4,51,2,3,4,5 对应的罗马数字分别为I，II，III，IV，V等。
 * <p>
 * 输入格式
 * <p>
 * 第一行输入一个整数 num(1 \leq num \leq 3999)num(1≤num≤3999)。
 * <p>
 * 输出格式
 * <p>
 * 输出 num 对应的罗马数字。
 * <p>
 * 样例输入
 * <p>
 * 123
 * 样例输出
 * <p>
 * CXXIII
 *
 * @author times
 * Time: 2017-11-16 15:00
 */
public class Test3 {

    public Test3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };
        String str = "";
        str += arr[3][n / 1000];
        str += arr[2][n / 100 % 10];
        str += arr[1][n / 10 % 10];
        str += arr[0][n % 10];
        System.out.println(str);
    }
}
