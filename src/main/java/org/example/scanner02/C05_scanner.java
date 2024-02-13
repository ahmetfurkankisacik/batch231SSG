package org.example.scanner02;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        //kullanicidan tek bir karakter alip yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tek bir karakter giriniz");
        char ch=scan.next().charAt(0);
        System.out.println(ch);
    }
}
