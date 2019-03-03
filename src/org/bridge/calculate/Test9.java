package org.bridge.calculate;

import java.util.Scanner;

/**
 * 下面我将描述一个简单的函数：
 * <p>
 * f(8)=2
 * <p>
 * f(16)=1
 * <p>
 * f(32)=0
 * <p>
 * f(2048)=3
 * <p>
 * 读入一个x(1≤x≤101000)，请你找出f(x)的值。
 * <p>
 * 输入包括一行，仅一个数字x。
 * <p>
 * 输出包括一行，仅一个数字f(x)。
 * <p>
 * 提示：
 * <p>
 * f(0)=1, f(1)=0, f(2)=0, f(3)=0, f(4)=0, f(5)=0, f(6)=1, f(7)=0, f(8)=2, f(9)=1
 * <p>
 * 有时候看数据猜题意也是很重要的技能，如果你看到这里还不知道题意的话，那么我来告诉你，f(x)表示x的十进制表示中有多少个圈圈。
 * <p>
 * <p>
 * <p>
 * 样例输入
 * <p>
 * 2048
 * 样例输出
 * <p>
 * 3
 *
 * @author times
 * Time: 2017-11-23 22:31
 */
public class Test9 {

    public Test9() {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] num = n.toCharArray();
        System.out.println(f(num));
    }

    static int f(char[] num) {
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == '0' || num[i] == '6' || num[i] == '9') n++;
            if (num[i] == '8') n += 2;
        }
        return n;
    }
}
