package org.example.doWhileLoop03;

import java.util.Scanner;

public class C01_doWhileLoop {
    public static void main(String[] args) {
        //Girilen tamsayının basamaklarının toplamını yazan program.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
      //  int sayi= scan.nextInt();
      //  sayi=Math.abs(sayi);
       int toplam=0;
       // do {
       //     toplam+=sayi%10;
       //     sayi/=10;//sayi=sayi/10;
       // }while (sayi>0);
       // System.out.println("basamaklarin toplami : "+toplam);
        for (int sayi = scan.nextInt(); sayi >0 ; sayi/=10) {
            toplam+=sayi%10;
        }
        System.out.println(toplam);
    }
}
