package org.bridge.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author times
 * Time: 2017-11-12 17:04
 */
public class Demo1 {

    public Demo1() {
        String[] s = {"a", "b", "c", "d"};
        sort(Arrays.asList(s), new ArrayList(), s.length);
    }

    // 输出
    public static void print(List target) {
        for (Object o : target) {
            System.out.print(o);
        }
        System.out.println();
    }

    // 递归排列
    public static void sort(List datas, List target, int n) {
        if (target.size() == n) {
            print(target);
            return;
        }
        for (int i = 0; i < datas.size(); i++) {
            List newDatas = new ArrayList(datas);
            List newTarget = new ArrayList(target);
            newTarget.add(newDatas.get(i));
            newDatas.remove(i);
            sort(newDatas, newTarget, n);
        }
    }
}
