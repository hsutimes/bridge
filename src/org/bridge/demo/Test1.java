package org.bridge.demo;

import java.util.*;

/**
 * 晓萌准备出门吃饭，已知他的钱包可以装K张纸币，世面上有的
 * 纸币种类为N种（如1元、3元）。请计算出第一个他无法在不被
 * 找零的情况下支付的额度M。例如：对于K=5，N=2，分别为1元
 * 和3元的情况，使用5张1元或者3元的纸币根本不可能直接支付
 * 14元的额度；因此这时M=13。
 * <p>
 * 输入第1行为空格分隔的两个整数，分别是K和N（1≤K≤200，1≤N≤50）。
 * 输入第2行列出由空格分隔的列出N中市面上有的纸币的价值（＜10000）。
 * <p>
 * 输出包括一行，为第一个无法在不被找零的情况下支付的额度M。
 *
 * @author times
 * Time: 2017-11-06 22:54
 */
public class Test1 {
    static int search(int[] num, int k) {

        return 0;
    }

    //    public static void main(String[] args) {
    public Test1() {
        Scanner sc = new Scanner(System.in);
        // 1≤K≤200，1≤N≤50
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int result = search(num, k);
        System.out.println();
    }


}
