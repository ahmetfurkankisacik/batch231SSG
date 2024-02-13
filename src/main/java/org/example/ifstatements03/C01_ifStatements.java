package org.example.ifstatements03;

public class C01_ifStatements {
    public static void main(String[] args) {
        int sayi1=15;
        int sayi2=25;
        if (sayi1>sayi2){
            System.out.println("buyuk olan sayi : "+sayi1);
        } else if (sayi2>sayi1) {
            System.out.println("buyuk olan sayi : "+sayi2);
        }else {
            System.out.println("sayilar birbirine esittir : "+sayi1);
        }
        /*
        karsilastirma operatorleri :
        ==,>=,<=,<,>,!=;
         */



    }
}
