package test.bridge15;

/**
 * @author times
 * 2、立方变自身
 */
public class Test2 {

    public Test2() {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            int s = i * i * i;
            if (i == fun(s)) {
                System.out.println(i+"^3="+s);
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    static int fun(int a) {
        if (a < 10) {
            return a;
        }
        return fun(a / 10) + a % 10;
    }
}
