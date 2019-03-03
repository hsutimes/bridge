package org.bridge.calculate;

import java.util.*;

/**
 * @author times
 * Time: 2017-11-17 15:33
 */
public class Test6 {

    public Test6() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char[] str, temp;
            str = s.toCharArray();
            System.out.println(max_substring(str));
        }
    }

    static int max_substring(char[] str) {
        int length = str.length;
        int begin = 0;              //记录最长子串的起点  以便输出最长串
        int end = 0;                //记录最长子串的终点  以便输出最长串
        int maxlen = 0;             //最长不重复字符串长度
        int j = 0;                  //记录当前不重复字符串的起点
        int i = 0;                  //记录当前不重复字符串的终点
        int hs[] = new int[128];    //用数组代替哈希表map
        int k = 0;
        int n = 0;
        /* 将模拟hashmap的数组初始化*/
        while (k < 128) {
            hs[k] = -1;
            k++;
        }
        //遍历字符数组
        while (i < length) {
            n = (int) str[i];
            if (hs[n] >= j) {   //如果当前维护的不重复子串中出现了str[i]
                j = hs[n] + 1;  //更新j
            } else {                  //如果当前维护的不重复子串没有出现str[i]
                if (i - j + 1 > maxlen) {
                    maxlen = i - j + 1;   /*更新结果取较大者*/
                    begin = j;        /*  并记录当前较大子串的起点*/
                    end = i;         /*  并记录当前较大子串的终点*/
                }
            }
            hs[n] = i;        //更新map(实际上是更新模拟map的数组)
            i++;
        }
        //打印输出最长串
        for (int m = begin; m <= end; ++m) {
            // System.out.print(str[m]);
        }
        return maxlen;
    }
}
