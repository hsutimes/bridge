package test.ceshi;

import java.math.BigInteger;

/**
 * @author times
 * @file Test1.java
 */
public class Test1 {

    public Test1() {
        BigInteger a = new BigInteger("13");
        for (int i = 1; i < 13; i++) {
            a=a.multiply(a);
        }
        String s = a.toString();
        System.out.println(s.substring(s.length()-3,s.length()));
    }
}
