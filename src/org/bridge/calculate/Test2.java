package org.bridge.calculate;

import java.util.Scanner;

/**
 * 给定一个数组和一个数（该数不一定在数组中），从数组里删掉这个数字，返回剩下的数组长度。
 * <p>
 * 如：A[] = {1, 2, 3, 4, 5}A[]=1,2,3,4,5，要删除数字 3，那么返回数组长度为 4。
 * <p>
 * 亲爱的小伙伴们，题目是不是很简单呢？
 * <p>
 * 提示：int removeElement(int A[], int n, int elem)
 * <p>
 * 其中，n代表数组长度，elem代表要删掉的元素。
 * <p>
 * 输入格式
 * <p>
 * 第一行输入一个数 n(1 \leq n \leq 100)n(1≤n≤100)，接下来一行 nn 个整数，
 * 表示数组 A 的所有元素  Ai(0≤Ai≤100)
 * 接着输入要删除的元素 elem(0≤elem≤100)。
 * <p>
 * 输出格式
 * <p>
 * 输出一个整数，表示剩余数组长度。
 * <p>
 * 样例输入
 * <p>
 * 2
 * 3 3
 * 3
 * 样例输出
 * <p>
 * 0
 *
 * @author times
 * Time: 2017-11-16 14:42
 */
public class Test2 {

    public Test2() {
        Scanner sc = new Scanner(System.in);
        int n, x;
        n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        x = sc.nextInt();
        System.out.println(removeElement(num, n, x));
    }

    static int removeElement(int num[], int n, int elem) {
        int length = n;
        for (int i = 0; i < n; i++) {
            if (num[i] == elem) {
                length--;
            }
        }
        return length;
    }
}
