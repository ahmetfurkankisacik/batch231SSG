package org.example.operations_concatinations;

import java.util.Scanner;

public class C01_operation {
    public static void main(String[] args) {
        //kullanicidan 2 sayi isteyin ve bu sayilara aritmatic operation yapiniz
        /*
        +
        -
        *
        /
        %
        **veya^(java'da gecerli degil baska dillerde us alma)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("toplamlari : "+(sayi+sayi2));
        System.out.println("farklari : "+(sayi-sayi2));
        System.out.println("farklari : "+(sayi2-sayi));
        System.out.println("carpimlari : "+(sayi2*sayi));
        System.out.println("bolumleri : "+(sayi2/sayi));
        System.out.println("bolumleri : "+(sayi/sayi2));
        System.out.println("bolumunden kalan : "+(sayi%sayi2));
        System.out.println("bolumunden kalan : "+(sayi2%sayi));
        System.out.println("birbirinin kati : "+Math.pow(sayi,sayi2));
        System.out.println("birbirinin kati : "+Math.pow(sayi2,sayi));




    }
}
