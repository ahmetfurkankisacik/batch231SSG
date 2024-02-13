package org.example.whileloop01;

import java.util.Random;
import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        //odev!!!! kullaniciya 5 tahmin hakkı verin bulursa tebrik edin(break atmayi unutmayin) bulamazsa exit atip tekrar oynamasini isteyin
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        int rndSayi= rnd.nextInt(101);
        int kullaniciSayi;
        int tahminSayisi=0;
        while(true){
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayi= scan.nextInt();
            tahminSayisi++;
            if (kullaniciSayi>rndSayi){
                System.out.println("lutfen daha kucuk sayi giriniz");
            } else if (rndSayi>kullaniciSayi) {
                System.out.println("lutfen daha buyuk sayi giriniz");
            }else {
                System.out.println(tahminSayisi+". tahminde buldunuz : "+kullaniciSayi);
                break;
            }
        }
    }
}
