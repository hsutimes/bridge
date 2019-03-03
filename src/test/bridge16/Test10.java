package test.bridge16;

import java.util.*;

/**
 * @author times
 * @file Test10.java
 * @time 2018/12/1
 * 10、压缩变换(程序设计)
 */
public class Test10 {

    public Test10() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] a = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = scanner.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (!map.keySet().contains(a[i])) {
                map.put(a[i], i);
                System.out.print(-a[i] + " ");
            } else {
                Integer position = map.get(a[i]);
                map.put(a[i], i);
                List<Integer> tmpList = new ArrayList<>();
                for (int j = position + 1; j < i; j++) {
                    if (!tmpList.contains(a[j])) {
                        tmpList.add(a[j]);
                    }
                }
                System.out.print(tmpList.size() + " ");
            }
        }
    }
}
