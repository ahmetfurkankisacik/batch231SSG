package org.example.doWhileloop02;

import java.util.Scanner;

public class C02_doWhileloop {
    public static void main(String[] args) {
        //negatif bir deger girilene kadar kullanicidan girisleri
        // kabul eden ve girilen degerlerden cift sayilari toplayan program yaziniz
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        do {
            System.out.println("sadece cift pozitif sayilari toplandigi uygulamaya hosgeldiniz siz negatif sayi girene kadar devam edecek");
            sayi= scan.nextInt();
            if (sayi%2==0&&sayi>0){
                toplam+=sayi;
            }else if (sayi%2==1){
                System.out.println("lutfen cift sayi giriniz");
            }

        }while (sayi>0);
        System.out.println("sayilarin toplami : "+toplam);





      //  while (sayi>0){
      //      System.out.println("sadece cift pozitif sayilari toplandigi uygulamaya hosgeldiniz siz negatif sayi girene kadar devam edecek");
      //      sayi= scan.nextInt();
      //  }
    }
}
