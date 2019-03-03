package com.leetcode;

import java.util.Stack;

/**
 * @author times
 * @file Test682.java
 * @time 2018/11/16 0016
 * @link https://leetcode-cn.com/problems/baseball-game/description/
 */
public class Test682 {

    public Test682() {
        String[] strings = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(strings));
    }

    static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        for (int score : stack) {
            ans += score;
        }
        return ans;
    }

}
