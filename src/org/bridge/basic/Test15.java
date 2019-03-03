package org.bridge.basic;

import java.util.*;

/**
 * 给定一个罗马数字 ss，将罗马数字转换成整数。
 * <p>
 * 如罗马数字I，II，III，IV，V分别代表数字 1, 2, 3, 4, 51,2,3,4,5。
 * 首先要来了解一下罗马数字表示法，基本字符有 77 个：I、V、X、L、C、D、M，分别表示 11、55、1010、5050、100100、500500、10001000。
 * 在构成数字的时候，有下列规则：
 * 1、相同的数字连写，所表示的数等于这些数字相加得到的数，如：III = 3=3；
 * 2、小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：VIII = 8=8；XII = 12=12；
 * 3、小的数字，（限于Ⅰ、X和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：IV = 4=4；IX = 9=9；
 * 4、正常使用时，连写的数字重复不得超过三次。
 * <p>
 * 输入格式
 * <p>
 * 输入一个罗马数字字符串，其对应的数字为 s(1 \leq s \leq 3999)s(1≤s≤3999)。
 * <p>
 * 输出格式
 * <p>
 * 输出对应的整数 ss。
 * <p>
 * 样例输入
 * <p>
 * CXXIII
 * 样例输出
 * <p>
 * 123
 *
 * @author times
 * Time: 2017-11-14 23:02
 */
public class Test15 {

    public Test15() {
        int sum = 0;
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            switch (str) {
                case 'M':
                    list.add(1000);
                    break;
                case 'D':
                    list.add(500);
                    break;
                case 'C':
                    list.add(100);
                    break;
                case 'L':
                    list.add(50);
                    break;
                case 'X':
                    list.add(10);
                    break;
                case 'V':
                    list.add(5);
                    break;
                case 'I':
                    list.add((1));
                    break;
                default:
                    break;
            }
        }
        // IV = 4
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 != list.size()) {
                if (list.get(i) < list.get(i + 1))
                    sum -= list.get(i);
                else
                    sum += list.get(i);
            } else
                sum += list.get(i);
        }
        System.out.println(sum);
        /**
         * Iterator t = list.iterator();
        Iterator t1 = list.iterator();
        while (t.hasNext()) {
            a = (int) t.next();
            try {
                b = (int) t1.next();
            } catch (NoSuchElementException e) {
                b = 0;
            }
            if (a < b) {
                a = b - a;
                t.next();
                try {
                    t1.next();
                } catch (NoSuchElementException e) {
                }
            }
            sum += a;
        }
        System.out.println(sum);*/

    }
}
