package org.example.ternaryNestedIf01;

import java.util.Scanner;

public class C05_nestedIf {
    public static void main(String[] args) {
        /*
        bir kişinin kan verip veremeyecegini kontrol ediniz
        yas: 18 ve uzeri
        kilo : 50 ve uzeri
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas>=18){
            System.out.println("lutfen kilonuzu giriniz");
            double kilo= scan.nextDouble();
            if (kilo>=50){
                System.out.println("kan verebilmek icin asağıdaki formu doldurunuz....");
            }else {
                System.out.println("kilonuz yetersiz");
            }
        }else {
            System.out.println("yaşınız küçük");
        }
    }
    /*
       bir lunaparka gelen musteriye once annesinden izin alıp alamadigini sorun aldiysa yasini sorun yasi (15e esit)15'ten buyukse
       kilosunu sorun kilosu (100e esit degil)100'den kucuk  binebilmesine izin verin
         */

}
