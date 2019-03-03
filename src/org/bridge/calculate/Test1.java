package org.bridge.calculate;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-15 13:29
 */
public class Test1 {

    public Test1() {
        Scanner sc = new Scanner(System.in);
        char[] str, str2, s;
        str = sc.nextLine().toCharArray();
        str2 = sc.nextLine().toCharArray();
        s = new char[str.length];
        for (int i = 0; i < s.length; i++) {
            if (str[i] == str2[i]) s[i] = '1';
            else s[i] = '0';
        }
        System.out.println(s);
    }
}
