package org.example.wrapperClass_TypeCasting03;

import java.util.Scanner;

public class C03_typeCasting {
    public static void main(String[] args) {
        //kullicindan bir karakter aliniz ve aldiginiz karakterin sayisal degerini yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen tek bir karakter giriniz");
        //  char karakter=input.next().charAt(0);
        //  int sayi=karakter;//autowiding;
        int sayi=input.next().charAt(0);
        // System.out.println(+karakter);
        System.out.println(sayi);


    }
}
