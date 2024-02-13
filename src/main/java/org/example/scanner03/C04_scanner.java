package org.example.scanner03;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen dikdortgenler prizmasinin sirasiyla uzun, kısa kenarlarini ve yuksekligini giriniz");
        double uzunKenar= input.nextDouble(),kisaKenar= input.nextDouble(),yukseklik=input.nextDouble();
        System.out.println("uzun kenar : "+uzunKenar);
        System.out.println("kısa kenar : "+kisaKenar);
        System.out.println("yukseklik : "+yukseklik);
        System.out.println("prizmanin hacmi : "+uzunKenar*kisaKenar*yukseklik);
        System.out.println("**************************************************");
        System.out.println("lutfen dikdortgenler prizmasinin uzun kenarini giriniz");
        double uzunkenar1=input.nextDouble();
        System.out.println("lutfen dikdortgenler prizmasinin kısa kenarini giriniz");
        double kisakenar1=input.nextDouble();
        System.out.println("lutfen dikdortgenler prizmasinin yukseklik giriniz");
        double yukseklik1=input.nextDouble();
        System.out.println("prizmanin hacmi : "+uzunkenar1*kisakenar1*yukseklik1);
    }
}
