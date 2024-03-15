package org.example.exception01;

import java.util.Scanner;

public class C02_exception {
    public static void main(String[] args) {
        System.out.println("Uygulamamıza hosgeldiniz");
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas<15){
            throw new AgeException("yasiniz 15'ten kucuk lutfen büyüyüp tekrar deneyiniz");
        }
    }
}
