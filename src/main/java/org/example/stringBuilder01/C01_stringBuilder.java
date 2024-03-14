package org.example.stringBuilder01;

public class C01_stringBuilder {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder(" java");
        StringBuilder str2=new StringBuilder("java");
        System.out.println((int)' ');
        System.out.println((int)'j');

       // System.out.println(str1.equals(str2));//false
       // System.out.println(str1==str2);//false
        //System.out.println(str1.equals(str1));//true
        //ikisininde referans noktasi farklı oldugu icin iki karsilastirmada da bana false dondurdu.
        //System.out.println(str1.toString().equals(str2.toString()));//true
        System.out.println(str1.compareTo(str2));
    }}
