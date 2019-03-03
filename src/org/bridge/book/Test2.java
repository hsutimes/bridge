package org.bridge.book;

import java.util.*;

/**
 * @author times
 * @file Test2.java
 * @time 2018/3/21 0021 22:54
 * <p>
 * 65536K
 * 学生成绩查找系统是一个根据姓名查找学生成绩的系统。系统可以录入是学生的姓名和成绩，
 * 录完之后可以输入查找条件，即学生的姓名，查找该生的成绩，如果存在该生的信息，则输出
 * 该生成绩，否则给出查无此人的提示信息。
 * <p>
 * 输入:题目输入包括录入学生信息和输入查找条件以及输入结束标志。insert语句表示录入
 * 学生信息，格式为字符insert+空格+字符串+空格+数字+换行符 ，例如 insert xiaohua 99 ，
 * 表示录入姓名为xiaohua的学生，其成绩为99 。 find语句表示查找某学生的信息，格式为字符
 * find+空格+字符串+换行符。例如 find xiaohua。end语句表示输入结束，格式为字符end
 * <p>
 * 输出：对应每一条find语句都应该有一条输出语句。对于find xiaohua这条输入语句，因
 * 为已经插入过xiaohua的成绩 需要输出 99+换行符，否则查找不到输出-1+换行符。
 * <p>
 * 样例输入
 * insert zhangsan 90
 * insert lisi 78
 * insert xiaoming 86
 * find xiaoming
 * find Jack
 * end
 * 样例输出
 * 86
 * -1
 */
public class Test2 {

    static LinkedList<String> l = new LinkedList<>();
    static Map<String, String> m = new HashMap<>();

    static void f(LinkedList l) {
        for (int i = 0; i < l.size(); i++) {
            String[] s = l.get(i).toString().split(" ");
            if ("insert".equals(s[0])) {
                m.put(s[1], s[2]);
            } else if ("find".equals(s[0])) {
                String x = m.get(s[1]), n;
                n = (x == null) ? "" + -1 : x;
                System.out.println(n);
            }
        }
    }

    public Test2() {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        while (!"end".equals(x)) {
            l.add(x);
            x = in.nextLine();
        }
        f(l);
    }
}
