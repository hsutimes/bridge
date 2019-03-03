package test.bridge16;

import java.util.Stack;

/**
 * @author times
 * @time 2018/12/1
 * 3、凑算式  (结果填空)
 */
public class Test3 {
    public static int count = 0;

    public Test3() {
        Stack<Integer> stack = new Stack<>();
        for (int a = 1; a < 10; a++) {
            stack.push(a);
            fun(stack);
            stack.pop();
        }
        System.out.println(count);
    }

    private static void fun(Stack<Integer> stack) {
        for (int j = 1; j < 10; j++) {
            if (stack.size() == 9) {
                int a = stack.get(0);
                int b = stack.get(1);
                int c = stack.get(2);
                int d = stack.get(3);
                int e = stack.get(4);
                int f = stack.get(5);
                int g = stack.get(6);
                int h = stack.get(7);
                int i = stack.get(8);
                int DEF = d * 100 + e * 10 + f;
                int GHI = g * 100 + h * 10 + i;
                int left = a * c * GHI + b * GHI + DEF * c;
                int right = 10 * c * GHI;
                if (left == right) {
                    count++;
                }
                return;
            }
            if (!stack.contains(j)) {
                stack.push(j);
                fun(stack);
                stack.pop();
            }
        }
    }
}
