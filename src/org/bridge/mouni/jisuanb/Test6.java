package org.bridge.mouni.jisuanb;

/**
 * 蒜头君今天突然开始还念童年了，想回忆回忆童年。他记得自己小时候，有
 * 一个很火的游戏叫做数独。便开始来了一局紧张而又刺激的高阶数独。蒜头
 * 君做完发现没有正解，不知道对不对？ 不知道聪明的你能否给出一个标准
 * 答案？
 * <p>
 * 标准数独是由一个给与了提示数字的 9 \times 99×9 网格组成，我们只
 * 需将其空格填上数字，使得每一行，每一列以及每一个 3 \times 33×3
 * 宫都没有重复的数字出现。
 * <p>
 * 输出这个数独得正解，输出格式如下：
 * <p>
 * * 2 6 * * * * * *
 * * * * 5 * 2 * * 4
 * * * * 1 * * * * 7
 * * 3 * * 2 * 1 8 *
 * * * * 3 * 9 * * *
 * * 5 4 * 1 * * 7 *
 * 5 * * * * 1 * * *
 * 6 * * 9 * 7 * * *
 * * * * * * * 7 5 *
 * 把上面的 * 替换成 1 - 91−9 就可以了
 * <p>
 * 提醒：两个数字之间要有一个空格，其他地方不要输出多余的符号。
 */
public class Test6 {
    private volatile static int n = 0;

    public Test6() {
        String str = "" +
                " * 2 6 * * * * * *\n" +
                " * * * 5 * 2 * * 4\n" +
                " * * * 1 * * * * 7\n" +
                " * 3 * * 2 * 1 8 *\n" +
                " * * * 3 * 9 * * *\n" +
                " * 5 4 * 1 * * 7 *\n" +
                " 5 * * * * 1 * * *\n" +
                " 6 * * 9 * 7 * * *\n" +
                " * * * * * * 7 5 *";
        System.out.println(str);
    }
}
