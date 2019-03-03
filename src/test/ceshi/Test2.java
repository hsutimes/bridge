package test.ceshi;


/**
 * @author times
 * @file Test1.java
 */
public class Test2 {

    public Test2() {
        int r = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                     if (i == j || j == k || i == k) continue;
                    System.out.println(i + " " + j + " " + k);
                    r++;
                }
            }
        }
        System.out.println(r);
    }
}
