package org.example.operations_concatinations;

import java.util.Scanner;

public class C02_operation {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyiniz ve bunlara assignment operation islemlerini yapiniz
        /*
        =(atama operatoru)
        ==(mantık operatoru esit mi diye kontrol eder)
        +=(artır ve atama)
        -=(eksilt ve ata)
        *=
        /=
        %=
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi1 += sayi2);//sayi1=sayi1+sayi2;
        System.out.println("toplama isleminden sonra : "+sayi1+" : "+sayi2);


        System.out.println(sayi2 -= sayi1);//sayi2=sayi2-sayi1;
        System.out.println("cıkarma isleminden sonra : "+sayi1 +" : "+sayi2);
        System.out.println(sayi1 *= sayi2);//sayi1=sayi1*sayi2;
        System.out.println("carpma isleminden sonra : "+sayi1 +" : "+sayi2);
        System.out.println(sayi1 /= sayi2);//sayi1=sayi1/sayi2;
        System.out.println("bolme isleminden sonra : "+sayi1 +" : "+sayi2);
        System.out.println(sayi1 %= sayi2);//sayi1=sayi1%sayi2;
        System.out.println("mod isleminden sonra : "+sayi1 +" : "+sayi2);
        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
