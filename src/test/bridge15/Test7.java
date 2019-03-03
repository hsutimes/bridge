package test.bridge15;

/**
 * @author times
 * @time 2018/12/1
 * 7、牌型种数
 */
public class Test7 {
    public static int ans = 0;

    public Test7() {
        dfs(0, 0);
        System.out.println(ans);
    }

    static void dfs(int type, int sum) {
        if (sum > 13) return;
        if (type == 13) {
            if (sum == 13) ans++;
            return;
        }
        for (int i = 0; i < 5; i++) {
            dfs(type + 1, sum + i);
        }
    }
}
