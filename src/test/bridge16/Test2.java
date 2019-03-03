package test.bridge16;

/**
 * @author times
 * @time 2018/12/1
 * 2、生日蜡烛  (结果填空)
 */
public class Test2 {

    public Test2() {
        for (int startAge = 1; startAge < 1000; startAge++) {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += startAge + i;
                if (sum == 236) {
                    System.out.println("startAge = " + startAge);
                }
            }
        }
    }

    private void f() {
        for (int i = 1; i < 20; i++) {
            int isDivisible = (472 + i - i * i) % (2 * i);
            if (isDivisible == 0) {
                System.out.printf("年龄：" + (472 + i - i * i) / (2 * i));
                System.out.printf(",过了%d个生日\n", i);
            }
        }
    }
}
