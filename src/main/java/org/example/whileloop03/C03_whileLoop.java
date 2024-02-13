package org.example.whileloop03;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {
        /*
        C'tusuna basana kadar hesap yapmaya devam eden bir hesap makinesi yapınız
         */
        Scanner scan=new Scanner(System.in);
        char operator='a';
        while (operator!='c'){
            System.out.println("lutfen islem yapmak istediginiz operatoru giriniz +,/,-,*,%,^ siz c' tusuna basana kadar calismaya devam edicek");
            operator=scan.next().charAt(0);
            switch (operator){
                case '+':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin toplami : "+(scan.nextDouble()+ scan.nextDouble()));
                    break;
                case '-':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin farki : "+(scan.nextDouble()- scan.nextDouble()));
                    break;
                case '*':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin carpimi : "+(scan.nextDouble()* scan.nextDouble()));
                    break;
                case '/':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin bolumu : "+(scan.nextDouble()/ scan.nextDouble()));
                    break;
                case '%':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin bolumunden kalan : "+(scan.nextDouble()% scan.nextDouble()));
                    break;
                case '^':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin kuvveti : "+Math.pow(scan.nextDouble(), scan.nextDouble()));
                    break;
                case 'c':
                    System.out.println("hesaplama islemi sona ermistir bizi tercih ettiginiz icin tesekkurler");
                    break;
                default:
                    System.out.println("lutfen gecerli bir operator giriniz");
                    break;
            }
        }
        //odev!!!! kullaniciya 5 tahmin hakkı verin bulursa tebrik edin(break atmayi unutmayin)
        //bulamazsa exit atip tekrar oynamasini isteyin
        //while dongusu kullanarak cozunuz
        //bilgisayara 1 ile 100 arasinda bir sayi tutturun
        //kullanicidan bu sayiyi tahmin etmesini isteyin
        //girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        //kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        //Random rnd=new Random();
        //int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
    }
}
