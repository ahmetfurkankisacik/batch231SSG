package org.example.stringManipulations02;

public class C03_stringManipulations {
    public static void main(String[] args) {
        //Bir String değişkeni oluşturunuz
        //ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        String str=" A hme t  ";
        str=str.trim();
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.substring(str.length() - 1));

       /*Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
       "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
        iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
        en sinirlayici durum hangisi : iki kelimeyi icermesi
        en sinirlayici olmayan durum : ikisini icermemesi
         */

    }
}
