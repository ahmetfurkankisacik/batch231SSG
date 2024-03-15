package org.example.collection02;

import java.util.HashSet;
import java.util.TreeSet;

public class C02_sets {
    public static void main(String[] args) {
        TreeSet<String> set1=new TreeSet<>();
        set1.add("3");
        set1.add("5");
        set1.add("7");
        set1.add("9");
        set1.add("1");
        set1.add("4");
        set1.add("8");
        System.out.println(set1);
    }
}
