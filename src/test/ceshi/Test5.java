package test.ceshi;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author times
 * @file Test5.java
 */
public class Test5 {

    public Test5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int t = 0;
        while (list.size() > 1) {
            for (int i = 1; i <= 3; i++) {
                if (i == 3) {
                    if (t >= list.size()) {
                        t -= list.size();
                    }
                    list.remove(t);
                    if (t >= list.size()) t -= list.size();
                } else {
                    t++;
                }
            }
            /*System.out.println();
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }*/
        }
        System.out.println(list.get(0));
    }
}
