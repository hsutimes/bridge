package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author times
 * @file T412.java
 * @time 2019/3/2
 */
public class T412 {
    public T412() {
        List<String>list=fizzBuzz(15);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }
        return list;
    }
}
