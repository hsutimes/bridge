package org.bridge.basic;

import java.util.*;
import java.lang.*;

/**
 * 16进制转换成8进制
 *
 * @author times
 * Time: 2017-11-08 21:54
 */
public class Test3 {

    public Test3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toOctalString(Integer.parseInt(s[i], 16)));
        }
    }
}
