package test.bridge16;

/**
 * @author times
 * 1.煤球数目  (结果填空)
 */
public class Test1 {

    public Test1() {
        int a[] = new int[101];
        for (int i = 1; i <= 100; i++) {
            a[i] = i * (i + 1) / 2;
        }
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
