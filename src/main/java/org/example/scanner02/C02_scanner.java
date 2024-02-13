package org.example.scanner02;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin
        // toplam,fark ve carpimlarini yazdirin
        Scanner input=new Scanner(System.in);
      // System.out.println("lutfen islem yapmak icin iki farkli sayi giriniz");
      // int sayi01= input.nextInt();
      // int sayi02= input.nextInt();
        System.out.println("------------------------------");
        System.out.println("lutfen islem yapmak icin ilk sayiyi giriniz");
        int sayi1= input.nextInt();
        System.out.println("lutfen islem yapmak icin ikinci sayiyi giriniz");
        int sayi2= input.nextInt();
        System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        System.out.println("sayilarin farki : "+(sayi1-sayi2));
        System.out.println("sayilarin carpimi : "+sayi1*sayi2);
        System.out.println("sayilarin bolumu : "+sayi1/sayi2);

    }
}
