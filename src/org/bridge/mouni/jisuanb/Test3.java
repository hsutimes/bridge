package org.bridge.mouni.jisuanb;

/**
 * 最近蒜头君喜欢上了U型数字，所谓U型数字，就是这个数字的每一位先
 * 严格单调递减，后严格单调递增。比如 212就是一个U型数字，但
 * 是 333, 98, 567, 31313，就是不是U型数字。
 * <p>
 * 现在蒜头君问你，[1,100000] 有多少U型数字？
 */
public class Test3 {

    public Test3() {
        int n = 0, x;
        String t;
        for (int i = 1; i <= 100000; i++) {
            t = String.valueOf(i);
            x = t.length();
            if (x == 3)
                if (t.charAt(0) == t.charAt(2))
                    if (Integer.valueOf(t.charAt(0)) > Integer.valueOf(t.charAt(1))) {
                        n++;
                        System.out.println(i);
                    }
            if (x == 4)
                if (t.charAt(0) == t.charAt(3) && t.charAt(1) == t.charAt(2))
                    if (Integer.valueOf(t.charAt(0)) > Integer.valueOf(t.charAt(1))) {
                        n++;
                        System.out.println(i);
                    }
            if (x == 5)
                if (t.charAt(0) == t.charAt(4) && t.charAt(1) == t.charAt(3))
                    if (Integer.valueOf(t.charAt(0)) > Integer.valueOf(t.charAt(1))
                            && Integer.valueOf(t.charAt(1)) > Integer.valueOf(t.charAt(2))) {
                        n++;
                        System.out.println(i);
                    }
        }
        System.out.println(n);
    }
}
