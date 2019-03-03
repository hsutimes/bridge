package test.bridge16;

import java.util.Stack;

/**
 * @author times
 * @time 2018/12/1
 * 6、方格填数（结果填空）
 */
public class Test6 {

    public static int count = 0;

    public Test6() {
        long startTime = System.currentTimeMillis();
        Stack<Integer> stack = new Stack<>();
        fun(stack);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+" ms");
        System.out.println("count=" + count);
    }

    private static void fun(Stack<Integer> stack) {
        if (stack.size() == 10) {
            int A[] = new int[10];
            A[0] = stack.get(0);
            A[1] = stack.get(1);
            A[2] = stack.get(2);
            A[3] = stack.get(3);
            A[4] = stack.get(4);
            A[5] = stack.get(5);
            A[6] = stack.get(6);
            A[7] = stack.get(7);
            A[8] = stack.get(8);
            A[9] = stack.get(9);
            boolean one = isNeibor(A[0], A[1], A[5], A[4], A[3]) && isNeibor(A[1], A[0], A[2], A[6], A[5], A[4]) && isNeibor(A[2], A[1], A[5], A[6]);
            boolean two = isNeibor(A[3], A[0], A[4], A[8], A[7]) && isNeibor(A[4], A[0], A[8], A[5], A[9], A[8], A[7], A[3])
                    && isNeibor(A[5], A[0], A[1], A[2], A[6], A[9], A[8], A[4]) && isNeibor(A[6], A[2], A[1], A[5], A[9]);
            boolean three = isNeibor(A[7], A[8]) && isNeibor(A[8], A[9]);

            if (one && two && three) {
                System.out.printf("  %d,%d,%d\n%d,%d,%d,%d\n%d,%d,%d\n", A[0], A[1], A[2], A[3], A[4], A[5], A[6], A[7], A[8], A[9]);
                count++;
            }
            return;
        }
        for (int j = 0; j < 10; j++) {
            if (!stack.contains(j)) {
                stack.push(j);
                fun(stack);
                stack.pop();
            }
        }
    }

    public static boolean isNeibor(int... args) {
        int first = args[0];
        for (int i = 1; i < args.length; i++) {
            if (Math.abs(first - args[i]) == 1) {
                return false;
            }
        }
        return true;
    }
}
