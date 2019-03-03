package org.bridge;

import java.util.*;

/**
 * @author times
 * @file Demo.java
 * @time 2018/2/8 0008 16:06
 */
public class Demo {
    private String id;

    public Demo() {
        this.id = "BIM";
    }

    public void enumTest() {
        Enumeration<String> days;
        Vector<String> dayName = new Vector<>();
        dayName.add("Sunday");
        dayName.add("Monday");
        dayName.add("Tuesday");
        dayName.add("Wednesday");
        dayName.add("Thursday");
        dayName.add("Friday");
        dayName.add("Saturday");
        days = dayName.elements();
        while (days.hasMoreElements()) {
            System.out.print(days.nextElement() + " | ");
        }
    }

    public void bitSetTest() {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }

    public void stackTest() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }
        int l = stack.size();
        for (int i = 0; i < l; i++) {
            System.out.print(stack.pop() + "|");
        }
    }

    public void mapTest(String num) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), "value" + i);
        }
        System.out.println(map.get(num));
    }

    public void hashtableTest() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        for (int i = 0; i < 10; i++) {
            hashtable.put(String.valueOf(i), "value" + i);
        }
        System.out.println(hashtable.size());
        for (int i = 0; i < hashtable.size(); i++) {
            System.out.print(hashtable.get(String.valueOf(i)) + "|");
        }
        System.out.println();
        hashtable.put("5", "change1454");
        hashtable.put("3", "change1454");
        hashtable.put("2", "change1454");
        hashtable.put("6", "change1454");
        for (int i = 0; i < hashtable.size(); i++) {
            System.out.print(hashtable.get(String.valueOf(i)) + "|");
        }
    }

    public String getId() {
        return id;
    }
}
