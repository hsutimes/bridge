package org.bridge.calculate;

import java.util.Scanner;

/**
 * @author times
 * Time: 2017-11-16 15:39
 */
public class Test5 {

    public Test5() {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
            s = sc.next();
        }
        System.out.println(s.length());
    }
}
