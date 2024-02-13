package org.example.scanner02;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen dikdortgenler prizmasinin sirasiyla uzun,kısa kenarini ve yuksekliginiz giriniz");
        double uzunKenar=input.nextDouble(),kisaKenar= input.nextDouble(),yukseklik=input.nextDouble();

        System.out.println("prizmanin hacmi : "+uzunKenar*kisaKenar*yukseklik+"m");

    }
}
