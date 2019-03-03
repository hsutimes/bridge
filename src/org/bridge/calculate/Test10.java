package org.bridge.calculate;

import java.util.Scanner;

/**
 * 给定3个字符串s1,s2,s3,判断s3是不是由s1,s2交错组成的。
 * <p>
 * 示例：
 * <p>
 * s1 = "aabcc",
 * <p>
 * s2 = "dbbca",
 * <p>
 * 当 s3 = "aadbbcbcac", return true.
 * <p>
 * 当 s3 = "aadbbbaccc", return false.
 * <p>
 * 格式：
 * <p>
 * 依次输入 3 个长度不超过 500 的字符串s1,s2,s3，中间以空格间隔开。
 * 当s3是由s1,s2交错组成，输出true，否则输出false。直到遇到结束符号的时候就结束。
 * <p>
 * 提示：while(cin>>s1>>s2>>s3)
 * <p>
 * 样例输入
 * <p>
 * aabd abdc aabdabdc
 * aabc abad aabcbaad
 * 样例输出
 * <p>
 * true
 * false
 *
 * @author times
 * Time: 2017-11-23 22:47
 */
public class Test10 {

    public Test10() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        String x = s[0], y = s[1], z = s[2];
        System.out.println(fun(x, y, z));
    }

    static boolean fun(String x, String y, String z) {
        boolean r1 = false, r2 = false;
        if (x.equals("") && y.equals("") && z.equals(""))
            return true;
        if (!x.equals("") && !z.equals("") && x.substring(0, 1).equals(z.substring(0, 1)))
            r1 = fun(x.substring(1), y, z.substring(1));
        if (!y.equals("") && !z.equals("") && y.substring(0, 1).equals(z.substring(0, 1)))
            r2 = fun(x, y.substring(1), z.substring(1));
        return r1 || r2;
    }
}
