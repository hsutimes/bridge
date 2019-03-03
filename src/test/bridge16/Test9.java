package test.bridge16;

import java.util.Scanner;

/**
 * @author times
 * @file Test9.java
 * @time 2018/12/1
 * 9、取球博弈  (程序设计)
 */
public class Test9 {
    static int b[] = {1, 3, 7, 8};
    static boolean a[] = new boolean[10010];

    public Test9() {
        Init();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        while (N-- > 0) {
            int n = input.nextInt();
            System.out.println(a[n] ? 1 : 0);
        }
    }

    private static void Init() {
        for (int i = 1; i < 10000; i++) {
            if (!a[i]) {
                for (int j = 0; j < 4; j++)
                    a[i + b[j]] = true;
            }
        }
    }
}
