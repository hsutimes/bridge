package org.bridge.basic;

/**
 * 问题描述
 * 　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的四位十进制数。
 *
 * @author times
 * Time: 2017-11-09 00:14
 */
public class Test7 {

    public Test7() {
        int num = 10;
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    for (int l = 0; l < num; l++) {
                        if (i == l && j == k) {
                            System.out.println(i * 1000 + j * 100 + k * 10 + l);
                        }
                    }
                }
            }
        }
    }
}
