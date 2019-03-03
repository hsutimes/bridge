package test.bridge17;

import java.util.Scanner;

/**
 * @author times
 * @file Test1.java
 */
public class Test1 {

    public Test1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t1 = System.currentTimeMillis();
        String[] arr = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int t = 0;
        int conut = 0;
        String string = "";
        for (int i = 1; i < n; i++) {
            for (int j = 2; j < 10000; j++) {
                t = (n - i) * j;
                string = "" + i + j + t;
                if (string.length() != 9) {
                    continue;
                } else {
                    boolean fa = false;
                    for (int k = 0; k < arr.length; k++) {
                        int index = string.indexOf(arr[k]);
                        if (index == -1) {
                            fa = false;
                            break;
                        }
                        fa = true;
                    }
                    if (fa) {
                        conut++;
                    }
                }
            }
        }
        System.out.println(conut);
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1+" ms");
    }
}
