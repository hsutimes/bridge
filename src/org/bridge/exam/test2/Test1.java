package org.bridge.exam.test2;

/**
 * 100 可以表示为带分数的形式：100 = 3 + 69258 / 714。
 * 还可以表示为：100 = 82 + 3546 / 197。
 * 注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
 * 类似这样的带分数，100 有 11 种表示法。
 * 输入格式
 * 从标准输入读入一个正整数N (N<1000*1000)
 * <p>
 * 输出格式
 * 程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
 * <p>
 * 注意：不要求输出每个表示，只统计有多少表示法！
 * 样例输入1
 * 100
 * 样例输出1
 * 11
 * 样例输入2
 * 105
 * 样例输出2
 * 6
 *
 * @author times
 * Time: 2017-11-29 21:16
 */
public class Test1 {
    static int c = 0;

    public Test1() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        String str = "1234";
//        allPermutation(str.toCharArray(), 0, 3);
        long t = System.currentTimeMillis();
        int n[] = {1, 2, 3, 4, 5};
        perm(n, 0, n.length - 1);
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t + " 毫秒");
        System.out.println(c);
    }

    static void perm(int[] data, int start, int end) {
        if (start == end) {
            for (int s : data)
                System.out.print(s);
            System.out.println();
            c++;
        } else {
            for (int i = start; i <= end; i++) {
                int t = data[i];
                data[i] = data[start];
                data[start] = t;
                perm(data, start + 1, end);
                t = data[i];
                data[i] = data[start];
                data[start] = t;
            }
        }
    }
}
