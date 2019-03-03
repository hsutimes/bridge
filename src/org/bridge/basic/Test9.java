package org.bridge.basic;

/**
 * 问题描述
 * 　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 *
 * @author times
 * Time: 2017-11-12 12:02
 */
public class Test9 {

    public Test9() {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i*i*i+j*j*j+k*k*k == i*100+j*10+k) {
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
    }
}
