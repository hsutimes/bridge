package org.bridge.basic;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-13 22:11
 */
public class Test14 {

    public Test14() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            int n = (int) str[i];
            if (n >= (int) 'A' && n <= (int) 'Z') {
                str[i] = Character.toLowerCase(str[i]);
            }
            if (n >= (int) 'a' && n <= (int) 'z') {
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        System.out.println(str);
    }
}
