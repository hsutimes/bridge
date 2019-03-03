package org.bridge.basic;

import java.util.Scanner;
import java.util.Stack;

/**
 * 问题描述
 * 　　输入一个只包含加减乖除和括号的合法表达式，求表达式的值。其中除表示整除。
 * 输入格式
 * 　　输入一行，包含一个表达式。
 * 输出格式
 * 　　输出这个表达式的值。
 * 样例输入
 * 1-2+3*(4-5)
 * 样例输出
 * -4
 * 数据规模和约定
 * 　　表达式长度不超过100，表达式运算合法且运算过程都在int内进行。
 *
 * @author times
 * Time: 2017-11-12 12:55
 */
public class Test12 {

    public Test12() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(expEvaluation(s.toCharArray()));
    }

    public static boolean isOperator(char c) {
        switch (c) {
            case '=':
            case '+':
            case '-':
            case '*':
            case '/':
            case '(':
            case ')':
            case '[':
            case ']':
                return true;
            default:
                return false;
        }
    }

    static char[][] op = {
            //+    -    *    /    (    )    [    ]    =
            {'>', '>', '<', '<', '<', '>', '<', '>', '>',},// +
            {'>', '>', '<', '<', '<', '>', '<', '>', '>',},// -
            {'>', '>', '>', '>', '<', '>', '<', '>', '>',},// +
            {'>', '>', '>', '>', '<', '>', '<', '>', '>',},// /
            {'<', '<', '<', '<', '<', '=', 'E', 'E', 'E',},// (
            {'>', '>', '>', '>', 'E', '>', 'E', '>', '>',},// )
            {'<', '<', '<', '<', '<', 'E', '<', '=', 'E',},// [
            {'>', '>', '>', '>', '<', '>', 'E', '>', '>',},// ]
            {'<', '<', '<', '<', '<', 'E', '<', 'E', '=',} // =
    };

    public static int getOperatorId(char operator) {
        int reCode;
        reCode = -1;
        switch (operator) {
            case '+':
                reCode = 0;
                break;
            case '-':
                reCode = 1;
                break;
            case '*':
                reCode = 2;
                break;
            case '/':
                reCode = 3;
                break;
            case '(':
                reCode = 4;
                break;
            case ')':
                reCode = 5;
                break;
            case '[':
                reCode = 6;
                break;
            case ']':
                reCode = 7;
                break;
            case '=':
                reCode = 8;
                break;
        }
        return reCode;
    }

    public static char precede(char operator1, char operator2) {
        int operatorId1, operatorId2;
        operatorId1 = getOperatorId(operator1);
        operatorId2 = getOperatorId(operator2);
        if (operatorId1 < 0 || operatorId1 > 8 || operatorId2 < 0
                || operatorId2 > 8) {
            return 'E';
        }
        return op[operatorId1][operatorId2];
    }

    public static double operate(double op1, char cal, double op2) {
        switch (cal) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            default:
                return 0;
        }
    }

    public static double expEvaluation(char[] exp) {
        char thera;
        int i = 0;
        double b, a, val;
        Stack<Character> optr = new Stack<Character>();
        Stack<Double> opnd = new Stack<Double>();
        optr.push('=');
        while (exp[i] != '=' || optr.lastElement() != '=') {
            if (!isOperator(exp[i])) {
                double temp;
                temp = exp[i] - '0';
                i++;
                while (!isOperator(exp[i]) && i < exp.length) {
                    temp = temp * 10 + exp[i] - '0';
                    i++;
                }
                opnd.push(temp);
            } else {
                switch (precede(optr.lastElement(), exp[i])) {
                    case '<':
                        optr.push(exp[i]);
                        i++;
                        break;
                    case '=':
                        optr.pop();
                        i++;
                        break;
                    case '>':
                        thera = optr.pop();
                        b = opnd.pop();
                        a = opnd.pop();
                        opnd.push(operate(a, thera, b));
                        break;
                }
            }
        }
        val = opnd.lastElement();
        return val;
    }
}
