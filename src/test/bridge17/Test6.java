package test.bridge17;

import java.util.Scanner;

/**
 * @author times
 * @file Test7.java
 * @time 2018/11/14 0014
 */
public class Test6 {
    static int n, res;

    public Test6() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        long t1 = System.currentTimeMillis();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        getQuanpailie(data, 0);
        System.out.println(res);
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1+" ms");
    }

    //计算各部分结果
    private static int getNum(int[] data, int i, int j) {
        int num = 0;
        for (int k = i; k < j; k++) {
            num = data[k] + num * 10;
        }
        return num;
    }

    private static void getQuanpailie(int[] data, int k) {

        if (k == data.length) {
            //将数组分为三部分
            for (int i = 1; i < data.length; i++) {
                for (int j = i + 1; j < data.length; j++) {
                    int pre = getNum(data, 0, i);
                    int mid = getNum(data, i, j);
                    int fon = getNum(data, j, 9);

                    if (mid % fon != 0)
                        continue;
                    if (pre + mid / fon == n)
                        res++;
                }
            }
        }

        for (int j = k; j < data.length; j++) {
            {
                int t = data[k];
                data[k] = data[j];
                data[j] = t;
            }//试探
            getQuanpailie(data, k + 1);
            {
                int t = data[k];
                data[k] = data[j];
                data[j] = t;
            }//回溯
        }
    }

}
