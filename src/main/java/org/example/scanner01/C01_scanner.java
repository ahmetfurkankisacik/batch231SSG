package org.example.scanner01;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=input.next();
        //System.out.println(input.nextLine());//dummpy
        System.out.println("lutfen soy isminizi giriniz");
        String soyIsim=input.next();
        System.out.println(isim+soyIsim);
    }
}
