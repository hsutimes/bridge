package org.bridge.calculate;

import java.util.*;

/**
 * @author times
 * Time: 2017-11-18 14:22
 */
public class Test7 {

    public Test7() {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        String[] num = new String[n];
        while (i < n) {
            num[i] = sc.next();
            i++;
        }
        Set s = new HashSet(Arrays.asList(num));
        System.out.println(s.size());*/
        int[] num = {0, 0, 1, 1, 1};
        System.out.println(removeDuplicates(num));
    }

    /**
     * 删除重复字符后的长度
     *
     * @param a
     * @return
     */
    static int removeDuplicates(int[] a) {
        int i = 0, j = 1;
        if (a.length == 0 || a.length == 1) {
            return a.length;
        }
        while (i < a.length && j < a.length) {
            if (a[i] == a[j]) {
                j++;
            } else {
                a[++i] = a[j++];
            }
        }
        return i + 1;
    }

    static int maxSubstring(char[] str) {
        int length = str.length;
        int maxlen = 0;
        int i = 0;
        int j = 0;
        int begin = 0;
        int end = 0;
        int[] hs = new int[128];
        int k = 0;
        while (k < 128) {
            hs[k] = -1;
            k++;
        }
        while (j < length) {
            int n = (int) str[j];
            if (hs[n] >= i) {
                i = hs[n] + 1;
            } else {
                if (j - i + 1 > maxlen) {
                    maxlen = j - i + 1;
                    begin = i;
                    end = j;
                }
            }
            hs[n] = j;
            j++;
        }
        for (int l = begin; l < end; l++) {
            System.out.print(str[l]);
        }
        System.out.println();
        return maxlen;
    }
}
