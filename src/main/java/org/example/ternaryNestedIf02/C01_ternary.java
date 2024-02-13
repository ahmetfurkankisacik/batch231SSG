package org.example.ternaryNestedIf02;

public class C01_ternary {
    public static void main(String[] args) {
        //   verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        //   100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        //   bir ternary olusturalim
        int sayi=18;
        Object obje=sayi > 100 ? sayi * sayi : "sayi 100'den buyuk olmali";
        System.out.println(obje);
        System.out.println(sayi > 100 ? sayi * sayi : "sayi 100'den buyuk olmali");


    }
}
