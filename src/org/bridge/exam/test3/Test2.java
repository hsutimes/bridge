package org.bridge.exam.test3;

import java.util.Scanner;

/**
 * @author times
 * @file Test2.java
 * @time 2018/3/13 0013 23:01
 * <p>
 * 2. 矩形运算
 * 两个矩形的并集指的是：能包含这两个矩形的最小矩形，它一定是存在的。
 * 本题目的要求就是：由用户输入两个矩形的坐标，程序输出它们的交集和并集矩形。
 * 矩形坐标的输入格式是输入两个对角点坐标，注意，不保证是哪个对角，
 * 也不保证顺序（你可以体会一下，在桌面上拖动鼠标拉矩形，4个方向都可以的）。
 * 输入数据格式：
 * x1,y1,x2,y2
 * x1,y1,x2,y2
 * 数据共两行，每行表示一个矩形。每行是两个点的坐标。x坐标在左，y坐标在右。
 * 坐标系统是：屏幕左上角为(0,0)，x坐标水平向右增大；y坐标垂直向下增大。
 * 要求程序输出格式：
 * x1,y1,长度,高度
 * x1,y1,长度,高度
 * 也是两行数据，分别表示交集和并集。如果交集不存在，则输出“不存在”
 * 前边两项是左上角的坐标。后边是矩形的长度和高度。
 * 例如，用户输入：
 * 100,220,300,100
 * 150,150,300,300
 * 则程序输出：
 * 150,150,150,70
 * 100,100,200,200
 * 例如，用户输入：
 * 10,10,20,20
 * 30,30,40,40
 * 则程序输出：
 * 不存在
 * 10,10,30,30
 */
public class Test2 {

    static int min(int a, int b) {
        return a > b ? b : a;
    }

    static int max(int a, int b) {
        return a < b ? b : a;
    }

    public Test2() {
        Scanner sc = new Scanner(System.in);
        String a, b;
        int x1, y1, x2, y2, m1, m2, n1, n2;
        int x, y, w, h;
        a = sc.nextLine();
        b = sc.nextLine();
//        a = "100,220,300,100";
//        b = "150,150,300,300";
        String[] t1, t2;
        t1 = a.split(",");
        t2 = b.split(",");
        x1 = min(Integer.valueOf(t1[0]), Integer.valueOf(t1[2]));
        y1 = min(Integer.valueOf(t1[1]), Integer.valueOf(t1[3]));
        x2 = max(Integer.valueOf(t1[0]), Integer.valueOf(t1[2]));
        y2 = max(Integer.valueOf(t1[1]), Integer.valueOf(t1[3]));
        m1 = min(Integer.valueOf(t2[0]), Integer.valueOf(t2[2]));
        n1 = min(Integer.valueOf(t2[1]), Integer.valueOf(t2[3]));
        m2 = max(Integer.valueOf(t2[0]), Integer.valueOf(t2[2]));
        n2 = max(Integer.valueOf(t2[1]), Integer.valueOf(t2[3]));
        if ((m1 <= x2 && n1 <= y2) && (m2 >= x1 && n2 >= y1)) {
            x = max(x1, m1);
            y = max(y1, n1);
            w = min(x2, m2) - x;
            h = min(y2, n2) - y;
            System.out.println(x + "," + y + "," + w + "," + h);
        } else {
            System.out.println("不存在");
        }
        x = min(x1, m1);
        y = min(y1, n1);
        w = max(x2, m2) - x;
        h = max(y2, n2) - y;
        System.out.println(x + "," + y + "," + w + "," + h);
    }
}
