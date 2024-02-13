package org.example.operations_concatinations02;

import java.util.Scanner;

public class C01_operations {
    public static void main(String[] args) {
        //kullanicidan 2 sayi isteyin ve bu sayilara aritmatic operation yapiniz
        /*
        +
        -
        *
        /
        %
        **veya^(java'da gecerli degil baska dillerde us alma işlemi yapar)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        //System.out.println(10/0.0);
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("toplamlari : "+(sayi1+sayi2));
        System.out.println("farklari : "+(sayi1-sayi2));
        System.out.println("farklari : "+(sayi2-sayi1));
        System.out.println("carpimlari : "+sayi2*sayi1);
        System.out.println("bolumleri : "+sayi2/sayi1);
        System.out.println("bolumleri : "+sayi1/sayi2);
        System.out.println("modlari : "+sayi1%sayi2);
        System.out.println("modlari : "+sayi2%sayi1);
        System.out.println("birbirinin ussu : "+Math.pow(sayi1,sayi2));
        System.out.println("birbirinin ussu : "+Math.pow(sayi2,sayi1));


    }
}
