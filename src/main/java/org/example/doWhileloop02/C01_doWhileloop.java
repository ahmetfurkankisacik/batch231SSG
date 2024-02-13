package org.example.doWhileloop02;

import java.util.Scanner;

public class C01_doWhileloop {
    public static void main(String[] args) {
        //Girilen tamsayının basamaklarının toplamını yazan program.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;
        sayi=Math.abs(sayi);
        do {
            toplam+=sayi%10;//birler basamagini verir
            sayi/=10;//sayi=sayi/10;
        }while (sayi>0);
        System.out.println("toplamlari : "+toplam);
    }
}
