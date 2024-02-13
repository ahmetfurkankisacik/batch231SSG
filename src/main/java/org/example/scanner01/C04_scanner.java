package org.example.scanner01;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen dikdortgenler prizmasinin sirasiyla uzun, kısa kenarlarını ve yuksekligini giriniz");
        double uzunKenar=scanner.nextDouble();
        double kisaKenar=scanner.nextDouble();
        double yukseklik=scanner.nextDouble();
        System.out.println("prizmanin hacmi : "+uzunKenar*kisaKenar*yukseklik);
        System.out.println("lutfen dikdortgenler prizmasinin uzun kenarini giriniz");
        double uzunKenar1=scanner.nextDouble();
        System.out.println("lutfen dikdortgenler prizmasinin kısa kenarini giriniz");
        double kisaKenar1=scanner.nextDouble();
        System.out.println("lutfen dikdortgenler prizmasinin yuksekligini giriniz");
        double yukseklik1=scanner.nextDouble();
        System.out.println("prizmanin hacmi : "+uzunKenar1*kisaKenar1*yukseklik1);
    }
}
