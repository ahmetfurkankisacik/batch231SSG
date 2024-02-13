package org.example.doWhileLoop03;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //negatif bir deger girilene kadar kullanicidan girisleri
        // kabul eden ve girilen degerlerden cift sayilari toplayan program yaziniz
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        do {
            System.out.println("sadece pozitif cift sayilarin toplandigi uygulamaya hosgeldiniz siz negatif sayi girene kadar toplamaya devam edicek");
            sayi= scan.nextInt();
            if (sayi%2==0&&sayi>0){
            toplam+=sayi;
            }else if (sayi%2==1){
                System.out.println("lutfen cift sayi giriniz");
            }else {
                System.out.println("negatif sayi girdiniz sizi tekrar bekleriz");
            }

        }while (sayi>0);
        System.out.println("toplamlari : "+toplam);
   //while (sayi>0){
   //    sayi= scan.nextInt();
   //}
    }
}
