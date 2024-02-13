package org.example.ifstatements01;

public class C01_ifStatements {
    public static void main(String[] args) {
        /*
        karsilastirma operatorleri : ==,<,>,>=,<=,!=
         */
        int sayi1=5;
        int sayi2=10;

        if (sayi1>sayi2) {
            System.out.println("buyuk olan sayi : "+sayi1);
            System.out.println("kucuk olan sayi : "+sayi2);
        }

        if (sayi2>sayi1){
            System.out.println("buyuk olan sayi : "+sayi2);
            System.out.println("kucuk olan sayi : "+sayi1);
        }
    }
}
