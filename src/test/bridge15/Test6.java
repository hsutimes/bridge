package test.bridge15;

import java.util.Arrays;

/**
 * @author times
 * @time 2018/12/1
 * 6、加法变乘法
 */
public class Test6 {

    public Test6() {
        int a[] = new int[49];
        for (int i = 0; i < 49; i++) {
            a[i] = i + 1;
        }

        int b[] = new int[47];

        for (int x = 0; x < 46; x++) {
            for (int y = x + 2; y <= 48; y++) {

                for (int i = 0, j = 0; i < 47 && j < 49; i++, j++) {
                    if (i == x || i == y) {
                        int s = a[j] * a[j + 1];
                        b[i] = s;
                        j++;
                    } else {
                        b[i] = a[j];
                    }
                }

                if (sum(b) == 2015) {
                    System.out.println("x = " + (x + 1));
                    System.out.println("y = " + (y + 2));
                    System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
                    System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
                    System.out.println("sum = " + sum(b));
                }
            }
        }

    }

    public static int sum(int a[]) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }
}
