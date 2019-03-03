package org.bridge.exam.test3;

import java.util.Scanner;

/**
 * @author times
 * @file Test1.java
 * @time 2018/3/13 0013 23:00
 *
 * 1.串的简单处理
 * 串的处理
 * 在实际的开发工作中，对字符串的处理是最常见的编程任务。
 * 本题目即是要求程序对用户输入的串进行处理。具体规则如下：
 * 1.	把每个单词的首字母变为大写。
 * 2.	把数字与字母之间用下划线字符（_）分开，使得更清晰
 * 3.	把单词中间有多个空格的调整为1个空格。
 * 例如：
 * 用户输入：
 * you and     me what  cpp2005program
 * 则程序输出：
 * You And Me What Cpp_2005_program
 * 用户输入：
 * this is     a      99cat
 * 则程序输出：
 * This Is A 99_cat
 * 我们假设：用户输入的串中只有小写字母，空格和数字，不含其它的字母或符号。
 * 每个单词间由1个或多个空格分隔。
 * 假设用户输入的串长度不超过200个字符。
 */
public class Test1 {

    public Test1() {
        String x = "you and     me what  cpp2005program";
        String y = "this is     a      99cat";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] n = s.split("\\s+");
        for (int i = 0; i < n.length; i++) {
            if (!n[i].substring(0, 1).matches("\\d")) {
                n[i] = n[i].substring(0, 1).toUpperCase() + n[i].substring(1);
                n[i] = n[i].replaceAll("\\d+", "_$0_");
            } else {
                n[i] = n[i].substring(0, 1).toUpperCase() + n[i].substring(1);
                n[i] = n[i].replaceAll("\\d+", "$0_");
            }
            System.out.print(n[i]);
            if (i != n.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
