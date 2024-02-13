package org.example.whileloop03;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        while (toplam<=500){
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            int sayi= scan.nextInt();
            if (sayi>0){
                toplam+=sayi;
            }else {
                System.out.println("lutfen pozitif sayi giriniz");
            }
        }
        System.out.println("artik yeter cok sayi girdin, toplam "+toplam+" oldu");

    }
}
