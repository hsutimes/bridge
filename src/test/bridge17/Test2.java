package test.bridge17;

import java.util.Scanner;

/**
 * @author times
 * @file Test2.java
 */
public class Test2 {

    public Test2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b - a - b);
    }
}
