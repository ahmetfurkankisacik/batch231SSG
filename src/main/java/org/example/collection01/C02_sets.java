package org.example.collection01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C02_sets {
    public static void main(String[] args) {
        TreeSet<String> set1=new TreeSet<>();
        set1.add("Ali Can");
        set1.add("Gökhan Akyar");
        set1.add("Merve Yüksek Tekin");
        set1.add("Hüseyin Emre Sanı");
        set1.add("Ali Can");
        System.out.println(set1);


    }
}
