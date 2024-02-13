package org.example.wrapperClass_TypeCasting02;

import java.util.Scanner;

public class C03_typeCasting {
    public static void main(String[] args) {
        //kullicindan bir karakter aliniz ve aldiginiz karakterin sayisal degerini yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        //char chr=scan.next().charAt(0);
        //int sayi=chr;
        int sayi= scan.next().charAt(0);
        System.out.println(sayi);
    }
}
