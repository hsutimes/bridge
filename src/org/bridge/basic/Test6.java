package org.bridge.basic;

/**
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 * <p>
 * 00000
 * 00001
 * 00010
 * 00011
 * 00100
 * <p>
 * 请按从小到大的顺序输出这32种01串。
 *
 * @author times
 * Time: 2017-11-08 22:18
 */
public class Test6 {

    public static void main(String[] args) {
    }

    public Test6() {
        int num = 2;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    for (int l = 0; l < num; l++) {
                        for (int m = 0; m < num; m++) {
                            System.out.println(i + "" + j + "" + k + "" + l + "" + m);
                        }
                    }
                }
            }
        }
    }
}
