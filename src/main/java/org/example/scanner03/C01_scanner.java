package org.example.scanner03;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String name=input.next();
        System.out.println(input.nextLine());//dummpy
        System.out.println("lutfen soyIsiminizi giriniz");
        String surname=input.next();
        System.out.println("ismi : "+name);
        System.out.println("soy ismi : "+surname);

    }
}
