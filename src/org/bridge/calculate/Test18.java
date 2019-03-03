package org.bridge.calculate;

/**
 * @author times
 * @file Test18.java
 * @time 2018/7/29 0029
 */
public class Test18 {

    public Test18() {
        int n = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < 10; l++) {
                        if (10 * i + j == 2 * k + 2 * l && 10 * k + l == 3 * i + 3 * j) {
                            n++;
                            System.out.println(i + "" + j + " " + k + "" + l);
                        }
                    }
                }
            }
        }
        System.out.println(n);
    }
}
