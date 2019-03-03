package test.bridge16;

/**
 * @author times
 * @time 2018/12/1
 * 7、剪邮票  (结果填空)
 */
public class Test7 {

    private static int mp[] = {1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14};
    private static int aa[] = new int[5];
    private static int vis[] = new int[5];
    private static int sum = 0;
    private static int b[] = {-1, 1, -5, +5};

    public Test7() {
        for (int a = 0; a < 12; a++)
            for (int b = a + 1; b < 12; b++)
                for (int c = b + 1; c < 12; c++)
                    for (int d = c + 1; d < 12; d++)
                        for (int e = d + 1; e < 12; e++) {
                            aa[0] = mp[a];
                            aa[1] = mp[b];
                            aa[2] = mp[c];
                            aa[3] = mp[d];
                            aa[4] = mp[e];
                            for (int i = 0; i < 5; i++) {
                                vis[i] = 0;
                            }
                            vis[0] = 1;
                            dfs(0);
                            int flag = 1;
                            for (int i = 0; i < 5; i++) {
                                if (vis[i] != 1) {
                                    flag = 0;
                                    break;
                                }
                            }
                            if (flag == 0) continue;
                            else {
                                sum++;
                            }
                        }
        System.out.println(sum);
    }

    public static void dfs(int n) {
        for (int i = 0; i < 4; i++) {
            int t = aa[n] + b[i];
            if (t < 1 || t > 14 || t == 5 || t == 10) continue;

            for (int j = 0; j < 5; j++)
                if (!(vis[j] == 1) && aa[j] == t) {
                    vis[j] = 1;
                    dfs(j);
                }
        }
    }
}
