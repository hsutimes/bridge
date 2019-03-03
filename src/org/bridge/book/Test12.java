package org.bridge.book;

import java.util.Scanner;

/**
 * @author times
 * @file Test12.java
 * @time 2018/7/12 0012
 * @url https://nanti.jisuanke.com/t/27650
 * <p>
 * 给一个字符串 ss 和字符串 tt，求出 ss 的所有去重全排列中 tt 出现的次数。
 * 比如aab的去重全排列为aab、aba、baa。注意aaaa算出现两次aaa。
 */
public class Test12 {

    public Test12() {
        long start = System.currentTimeMillis(), end;
        permutate("abc");
        end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s, t;
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            s = in.next();
            t = in.next();
            r[i] = solve(s, t);
        }*/
    }

    static int solve(String s, String t) {
        int l = s.length();
        char[] a = s.toCharArray();
        for (int i = 0; i < l; i++) {

        }

        return 0;
    }

    static void permutate(String input) {
        if (input == null)
            throw new IllegalArgumentException();
        char[] data = input.toCharArray();
        permutate(data, 0);
    }

    static void permutate(char[] data, int begin) {
        int length = data.length;
        if (begin == length) {
            System.out.print(data);
            System.out.println("--");
        }
        for (int i = begin; i < length; i++) {
            if (isUnique(data, begin, i)) {
                swap(data, begin, i);
                permutate(data, begin + 1);
                swap(data, begin, i);
            }
        }
    }

    static void swap(char[] data, int left, int right) {
        char temp = data[left];
        data[left] = data[right];
        data[right] = temp;
        System.out.println(data);
    }

    static boolean isUnique(char[] data, int begin, int end) {
        for (int i = begin; i < end; i++)
            if (data[i] == data[end])
                return false;
        return true;
    }
}
