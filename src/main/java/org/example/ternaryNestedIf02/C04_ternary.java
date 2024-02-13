package org.example.ternaryNestedIf02;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String str=scan.next().toLowerCase();
        str=str.replaceAll("[^a-zA-Z]","*");
        str=str.replaceAll("[aeiou]","e");
        if (str.length()==1&&!str.contains("*")){
            System.out.println(str.equals("e") ? "sesli harftir" : "sessiz harftir");
        }else {
            System.out.println("yanlış ya da fazla harf girdiniz lutfen tekrar deneyiniz");
        }
        System.out.println(str.length() == 1 && !str.contains("*") ? (str.equals("e") ? "sesli harftir" : "sessiz harftir") : "yanlış ya da fazla harf girdiniz lutfen tekrar deneyiniz");
        /*
        bir lunaparka gelen musteriye once annesinden izin alıp alamadigini sorun aldiysa yasini sorun yasi (15e esit)15'ten buyukse
        kilosunu sorun kilosu (100e esit degil)100'den kucuk  binebilmesine izin verin
         */

    }
}
