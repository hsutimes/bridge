package com.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author times
 * @file Test22.java
 * @time 2018/10/13 0013
 */
public class Test22 {
    private Map<Integer, Node> cache;
    private int capacity = 0;
    private int used = 0;

    public Test22() {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        try {
            Thread.sleep(1000);
            System.out.println(System.nanoTime());
            Thread.sleep(1000);
            System.out.println(System.nanoTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * @param capacity: An integer
     */
    public Test22(int capacity) {
        // do intialization if necessary
        cache = new HashMap<>(capacity * 2);
        this.capacity = capacity;
    }

    /*
     * @param key: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void set(int key, int value) {
        // write your code here
        Node n = cache.get(key);
        if (n != null) {
            n.value = value;
            n.usedTimes++;
            n.lastUsedTime = System.nanoTime();
        } else {
            n = new Node();
            n.value = value;
            n.usedTimes = 0;
            n.lastUsedTime = System.nanoTime();
            if (used < capacity) {
                cache.put(key, n);
                used++;
            } else {
                removeLast();
                cache.put(key, n);
            }
        }
    }

    /*
     * @param key: An integer
     * @return: An integer
     */
    public int get(int key) {
        // write your code here
        Node n = cache.get(key);
        if (n != null) {
            n.usedTimes = n.usedTimes + 1;
            n.lastUsedTime = System.nanoTime();
            return n.value;
        } else {
            return -1;
        }
    }

    private void removeLast() {
        int minCount = Integer.MAX_VALUE;
        long time = System.nanoTime();

        Integer k = null;
        for (Map.Entry<Integer, Node> entry : cache.entrySet()) {
            if (entry.getValue().usedTimes < minCount
                    || (entry.getValue().usedTimes == minCount
                    && entry.getValue().lastUsedTime < time)) {
                k = entry.getKey();
                minCount = entry.getValue().usedTimes;
                time = entry.getValue().lastUsedTime;
            }
        }
        cache.remove(k);
    }

    public class Node {
        public int value;
        public int usedTimes;
        public long lastUsedTime;
    }
}