package org.bridge.exam.test;

import java.util.*;

/**
 * @author times
 * Time: 2017-11-16 18:41
 */
public class Test2 {

    public Test2() {
        Scanner sc = new Scanner(System.in);
        String x, s;
        s = sc.nextLine();
        String[] str, tem;
        str = s.split(" ");
        tem = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            x = str[i];
            if (x.contains(".")) {
                x = x.substring(0, x.length() - 1);
            }
            str[i] = x.toUpperCase();
            tem[i] = str[i];
        }
        int num = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {
                if (str[i].equals(tem[j])) {
                    tem[j] = "";
                    num++;
                }
            }
            if (num != 0) {
                System.out.print(str[i] + ":");
                for (int k = 0; k < num; k++) {
                    System.out.print("*");
                }
                System.out.println(num);
                num = 0;
            }
        }
    }
}
