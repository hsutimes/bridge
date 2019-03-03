package test.bridge15;

import java.util.Vector;

/**
 * @author times
 * @time 2018/12/1
 * 4、循环节长度
 */
public class Test4 {

    public Test4() {
        System.out.println(f(11, 13));
    }

    public static int f(int n, int m) {
        n = n % m;
        Vector v = new Vector();

        for (; ; ) {
            v.add(n);
            n *= 10;
            n = n % m;
            if (n == 0) return 0;
            if (v.indexOf(n) >= 0) {
                return v.size() - v.indexOf(n);
            }
        }
    }

}
