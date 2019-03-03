package org.bridge.demo;

/**
 * 看这个算式：
 * ☆☆☆ + ☆☆☆ = ☆☆☆
 * 如果每个五角星代表 1 ~ 9 的不同的数字。
 * 这个算式有多少种可能的正确填写方法？
 * 173 + 286 = 459
 * 295 + 173 = 468
 * 173 + 295 = 468
 * 183 + 492 = 675
 * 以上都是正确的填写法！
 *
 * @author times
 * Time: 2017-11-12 15:59
 */
public class Demo10 {
    static int count = 0;

    public Demo10() {
        for (int i = 1; i <= 9; i++) { // 第一个数的百位
            for (int j = 1; j <= 9; j++) { // 十位
                for (int k = 1; k <= 9; k++) { // 个位
                    for (int l = 1; l <= 9; l++) { // 第二个数的百位
                        for (int m = 1; m <= 9; m++) { // 十位
                            for (int n = 1; n <= 9; n++) { // 个位
                                if (i != j && i != k && i != l && i != m && i != n &&
                                        j != k && j != l && j != m && j != n &&
                                        k != l && k != m && k != n &&
                                        l != m && l != n &&
                                        m != n) {
                                    int a = i * 100 + j * 10 + k;
                                    int b = l * 100 + m * 10 + n;
                                    int c = a + b;
                                    int x, y, z;
                                    if (c > 99 && c < 999) {
                                        x = c / 100;
                                        y = c % 100 / 10;
                                        z = c % 10;
                                    } else {
                                        break;
                                    }
                                    if (x != y && x != z && y != z &&
                                            x != i && x != j && x != k && x != l && x != m && x != n &&
                                            y != i && y != j && y != k && y != l && y != m && y != n &&
                                            z != i && z != j && z != k && z != l && z != m && z != n &&
                                            x != 0 && y != 0 && z != 0) {
                                        System.out.println(a + " + " + b + " = " + c);
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("总个数:" + count);
    }
}
