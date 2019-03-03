package test.ceshi;

import java.util.Scanner;

/**
 * @author times
 * @file Test1.java
 */
public class Test4 {

    public Test4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String t = sc.next();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(t);
    }
}
