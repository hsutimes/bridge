package org.bridge.demo;

/**
 * 将任意十进制正小数分别转换成2,3,4,5,6,7,8,9进制正小数，小数点后保留8位，并输出。
 * 例如：若十进制小数为0.795，则输出：
 * 十进制正小数 0.795000 转换成 2 进制数为: 0.11001011
 * 十进制正小数 0.795000 转换成 3 进制数为: 0.21011011
 * 十进制正小数 0.795000 转换成 4 进制数为: 0.30232011
 * 十进制正小数 0.795000 转换成 5 进制数为: 0.34414141
 * 十进制正小数 0.795000 转换成 6 进制数为: 0.44341530
 * 十进制正小数 0.795000 转换成 7 进制数为: 0.53645364
 * 十进制正小数 0.795000 转换成 8 进制数为: 0.62702436
 * 十进制正小数 0.795000 转换成 9 进制数为: 0.71348853
 * 以下代码提供了这个功能。其中，dTestNo表示待转的十进制小数。iBase表示进制数。请填写缺失的部分。
 * <p>
 *
 * @author times
 * Time: 2017-11-12 14:55
 */
public class Demo4 {

    private static void fun(double dTestNo, int iBase) {
        int[] iT = new int[8];
        int iNo;
        System.out.printf("十进制正小数 %f 转换成 %d 进制数为: ", dTestNo, iBase);
        for (iNo = 0; iNo < 8; iNo++) {
            dTestNo *= iBase;
            iT[iNo] = (int) dTestNo;    // 填空
            if (dTestNo >= 1.0) dTestNo -= iT[iNo]; // 填空
        }
        System.out.printf("0.");
        for (iNo = 0; iNo < 8; iNo++)
            System.out.printf("%d", iT[iNo]);
        System.out.printf("\n");
    }

    public Demo4() {
        double dTestNo = 0.795;
        int iBase;
        for (iBase = 2; iBase <= 9; iBase++)
            fun(dTestNo, iBase);
        System.out.printf("\n");
    }
}
