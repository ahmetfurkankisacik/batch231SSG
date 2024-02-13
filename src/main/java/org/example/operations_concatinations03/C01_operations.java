package org.example.operations_concatinations03;

import java.util.Scanner;

public class C01_operations {
    public static void main(String[] args) {
        //kullanicidan 2 sayi isteyin ve bu sayilara aritmatic operation yapiniz
        /*
        + : toplama islemi icin
        - : cıkarma islemi icin
        * : carpma islemi icin
        / : bolme islemi icin
        % : mod almak icin
        **veya^ : us almak icin kullanilir fakat java'da us almak icin ya for dongusu yada Math classinda pow methodu cagrilir
         */
     //  int taban=5;
     //  int kuvvet=3;
     //  int carpim=1;
     //  for (int i = 1; i <=kuvvet ; i++) {
     //      carpim*=taban;
     //  }
     //  System.out.println(carpim);
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("toplamlari : "+(sayi1+sayi2));
        System.out.println("farklari : "+(sayi1-sayi2));
        System.out.println("farklari : "+(sayi2-sayi1));
        System.out.println("carpimlari : "+(sayi2*sayi1));
        System.out.println("bolumleri : "+(sayi2/sayi1));
        System.out.println("bolumleri : "+(sayi1/sayi2));
        System.out.println("modlari : "+(sayi1%sayi2));
        System.out.println("modlari : "+(sayi2%sayi1));
        System.out.println("birbirinin kati : "+Math.pow(sayi1,sayi2));
        System.out.println("birbirinin kati : "+Math.pow(sayi2,sayi1));





    }}
