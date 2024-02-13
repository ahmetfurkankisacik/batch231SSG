package org.example.doWhileloop;

import java.util.Scanner;

public class C01_doWhileLoop {
    public static void main(String[] args) {
        //Girilen tamsayının basamaklarının toplamını yazan program.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
       // int sayi= scan.nextInt();
        int toplam=0;

       // do {
       //     toplam+=sayi%10;//birler basamagi
       //     sayi=sayi/10;//basamak azaltma
       // }while (sayi>0);
       // System.out.println("basamaklarin toplami : "+toplam);
        for (int sayi= Math.abs(scan.nextInt()); sayi >0 ; sayi/=10) {
            toplam+=sayi%10;
        }
        System.out.println("basamaklarin toplami : "+toplam);
    }}
