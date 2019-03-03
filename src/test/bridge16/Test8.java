package test.bridge16;

/**
 * @author times
 * @file Test8.java
 * @time 2018/12/1
 * 8、四平方和  (程序设计)
 */
public class Test8 {

    public Test8() {
        int Number = 773535;
        int maxSubNumber = (int) Math.sqrt(Number);
        Loop:
        for (int a = 0; a <= maxSubNumber; a++) {
            for (int b = a; b < maxSubNumber; b++) {
                for (int c = b; c <= maxSubNumber; c++) {
                    for (int d = c; d <= maxSubNumber; d++) {
                        int S = a * a + b * b + c * c + d * d;
                        if (S == Number) {
                            System.out.print(a);
                            System.out.print(" " + b);
                            System.out.print(" " + c);
                            System.out.print(" " + d);
                            break Loop;
                        }
                    }
                }
            }
        }
    }
}
