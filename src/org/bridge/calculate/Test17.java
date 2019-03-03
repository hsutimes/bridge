package org.bridge.calculate;

import java.util.*;

/**
 * @author times
 * @file Test17.java
 * @time 2018/7/29 0029
 */
public class Test17 {

    public Test17() {
        point[] vertex = new point[100];
        int pointNum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 100; i++) {
                vertex[i] = new point();
            }
            pointNum = in.nextInt();
            for (int i = 0; i < pointNum; i++) {
                vertex[i].x = in.nextInt();
                vertex[i].y = in.nextInt();
            }
            System.out.printf("%.6f", caculate(vertex, pointNum));
        }
    }

    public static float caculate(point vertex[], int pointNum) {
        int i = 0;
        float temp = 0;
        for (; i < pointNum - 1; i++) {
            temp += (vertex[i].x - vertex[i + 1].x) * (vertex[i].y + vertex[i + 1].y);
        }
        temp += (vertex[i].x - vertex[0].x) * (vertex[i].y + vertex[0].y);
        return Math.abs(temp / 2);
    }

    class point {
        public int x;
        public int y;

        point() {
            this.x = 0;
            this.y = 0;
        }
    }
}
