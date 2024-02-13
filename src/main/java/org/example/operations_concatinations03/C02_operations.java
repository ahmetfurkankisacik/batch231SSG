package org.example.operations_concatinations03;

import java.util.Scanner;

public class C02_operations {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyiniz ve bunlara assignment operation islemlerini yapiniz
        /*
        =//== ile karistirmayin!!!
        +=(sayi1=sayi1+sayi2==sayi1+=sayi2;)daima true
        -=
        *=
        /=
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        int sayi1= scan.nextInt();//5
        int sayi2= scan.nextInt();//8
        System.out.println("sayi 1 degeri : "+ sayi1);
        System.out.println("sayi 2 degeri : "+ sayi2);
        //swap
        sayi1+=sayi2;//sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1-=sayi2;//sayi1=sayi1-sayi2;
        System.out.println("sayi 1 degeri : "+ sayi1);
        System.out.println("sayi 2 degeri : "+ sayi2);



    }
}
