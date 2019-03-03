package org.bridge.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 看下面的算式：
 * □□ x □□ = □□ x □□□
 * 它表示：两个两位数相乘等于一个两位数乘以一个三位数。
 * 如果没有限定条件，这样的例子很多。
 * 但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。
 * 该算式中1至9的每个数字出现且只出现一次！
 * 比如：
 * 46 x 79 = 23 x 158
 * 54 x 69 = 27 x 138
 * 54 x 93 = 27 x 186
 * .....
 * 请编程，输出所有可能的情况！
 * 注意：
 * 左边的两个乘数交换算同一方案，不要重复输出！
 * 不同方案的输出顺序不重要
 *
 * @author times
 * Time: 2017-11-12 15:06
 */
public class Demo5 {
    public static long count = 0;
    private static List<Vector<Character>> filteredNonRedundantResults;

    public Demo5() {
        Scanner scanner = new Scanner(System.in);
        int n = 9;
        Vector<Character> sourse = new Vector<Character>();
        Vector<Character> result = new Vector<Character>();
        for (int i = 1; i <= n; i++) {
            sourse.add((char) ('0' + i));
        }
        filteredNonRedundantResults = new ArrayList<Vector<Character>>();
        fullPermutation(sourse, result);
        System.out.println(filteredNonRedundantResults.size());
        for (int i = 0; i < filteredNonRedundantResults.size(); i++) {
            print(filteredNonRedundantResults.get(i));
            System.out.println();
        }
    }

    private static boolean isfilter(Vector<Character> result) {
        int a = (result.elementAt(0) - '0') * 10 + (result.elementAt(1) - '0');
        int b = (result.elementAt(2) - '0') * 10 + (result.elementAt(3) - '0');
        int c = (result.elementAt(4) - '0') * 10 + (result.elementAt(5) - '0');
        int d = (result.elementAt(6) - '0') * 100 + (result.elementAt(7) - '0') * 10 + (result.elementAt(8) - '0');
        if (a * b == c * d) {
            return true;
        }
        return false;
    }

    public static void print(Vector<Character> vector) {
        System.out.printf("%c%c x %c%c = %c%c x %c%c%c", vector.elementAt(0), vector.elementAt(1), vector.elementAt(2), vector.elementAt(3), vector.elementAt(4), vector.elementAt(5), vector.elementAt(6), vector.elementAt(7), vector.elementAt(8));
    }

    private static void fullPermutation(Vector<Character> sourse, Vector<Character> result) {
        if (sourse.size() == 0 && isfilter(result)) {
            boolean exit = false;
            for (int i = 0; i < filteredNonRedundantResults.size(); i++) {
                int ra = (result.elementAt(0) - '0') * 10 + (result.elementAt(1) - '0');
                int rb = (result.elementAt(2) - '0') * 10 + (result.elementAt(3) - '0');
                int fa = (filteredNonRedundantResults.get(i).elementAt(0) - '0') * 10 + (filteredNonRedundantResults.get(i).elementAt(1) - '0');
                int fb = (filteredNonRedundantResults.get(i).elementAt(2) - '0') * 10 + (filteredNonRedundantResults.get(i).elementAt(3) - '0');
                if (ra == fb && rb == fa) {
                    exit = true;
                    break;
                }
            }
            if (exit == false) {
                filteredNonRedundantResults.add(new Vector<Character>(result));
            }
            return;
        }
        for (int i = 0; i < sourse.size(); i++) {
            result.add(sourse.elementAt(i));
            sourse.remove(i);
            fullPermutation(sourse, result);
            sourse.add(i, result.elementAt(result.size() - 1));
            result.remove(result.size() - 1);
        }
    }
}
