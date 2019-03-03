package org.bridge.mouni.jisuanb;

/**
 * 蒜头君今天回到了老家的大宅院，老家的灯还是那中拉线的灯（拉一次为亮，
 * 再拉一次就灭），蒜头君觉得无聊。把 10001000 盏灯 33 的倍数拉了一
 * 次，55 的倍数拉了一次，7的倍数拉了一次（灯得的编号从 1-10001−1000,
 * 灯的初始状态都是亮的）。这个时候蒜头君在想还剩下几盏灯还在亮着？
 * <p>
 * 提示：请不要输出多余的符号。
 */
public class Test2 {

    public Test2() {
        int n = 1000, x = 0, y = 0, z = 0, xy = 0, xz = 0, yz = 0, xyz = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) x++;
            if (i % 5 == 0) y++;
            if (i % 7 == 0) z++;
            if (i % 3 == 0 && i % 5 == 0) xy++;
            if (i % 3 == 0 && i % 7 == 0) xz++;
            if (i % 5 == 0 && i % 7 == 0) yz++;
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) xyz++;
        }
        /*System.out.print(x + "|" + y + "|" + z + "\n");
        System.out.print(xy + "|" + xz + "|" + yz + "\n");
        System.out.println(xyz);
        System.out.println(n);*/
        System.out.println(n - (x + y + z - (xy + xz + yz - 3 * xyz) - 2 * xyz) + (xy + xz + yz - 3 * xyz));
    }
}
