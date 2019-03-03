package com.lintcode;

/**
 * @author times
 * @file Test212.java
 * @time 2018/10/16 0016
 */
public class Test212 {

    public Test212() {
        char[] string = "hello java".toCharArray();
        int length = string.length;
        System.out.println(replaceBlank(string, length));
//        System.out.println(replaceBlank2(string, length));
        System.out.println(string);
    }

    public int replaceBlank(char[] string, int length) {
        // write your code here
        int num = 0;
        int l = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') num++;
        }
        l = length + num * 2;
        char[] chars = new char[l];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] != ' ') {
                chars[j++] = string[i];
            } else {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            }
        }
        for (int i = 0; i < l; i++) {
            string[i] = chars[i];
        }
        return l;
    }

    public int replaceBlank2(char[] cArr, int length) {
        for (int i = 0; i < length; ) {
            char c = cArr[i];
            if (c == ' ') {
                for (int j = length - 1; j > i; j--) {
                    cArr[j + 2] = cArr[j];
                }
                cArr[i] = '%';
                cArr[i + 1] = '2';
                cArr[i + 2] = '0';
                i += 3;
                length += 2;
            } else {
                i++;
            }
        }
        return length;
    }
}




































