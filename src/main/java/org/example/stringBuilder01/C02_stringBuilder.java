package org.example.stringBuilder01;

public class C02_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Ali");
        sb.append(" topu at.");
        String str="camdan veli";

        System.out.println(sb);
        sb.insert(9,str,0,7);
        System.out.println(sb);
        sb.delete(9,16);
        System.out.println(sb);

    }
}
