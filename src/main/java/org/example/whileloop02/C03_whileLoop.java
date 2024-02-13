package org.example.whileloop02;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {
        /*
        kullanıcı c tusuna basana kadar işlem yapmaya devam eden bir hesap makinesi yapınız
         */
        Scanner scan=new Scanner(System.in);
        char operator='+';
        while(operator!='c'){
            System.out.println("lutfen islem yapmak istediginz operatoru giriniz +,*,/,-,%,^ siz c tusuna basana kadar calısmaya devam edicek");
            operator=scan.next().charAt(0);
            switch (operator){
                case '+':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin toplami : "+(scan.nextDouble()+scan.nextDouble()));
                    break;
                case '-':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin farki : "+(scan.nextDouble()-scan.nextDouble()));
                    break;
                case '*':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin carpimi : "+(scan.nextDouble()*scan.nextDouble()));
                    break;
                case '/':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    double say1= scan.nextDouble();
                    double say2= scan.nextDouble();
                    if (say2==0){
                        System.out.println("payda 0 olamaz");
                    }else {
                        System.out.println("sayilarin bolumu : "+say1/say2);
                    }
                    break;
                case '%':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    double say4= scan.nextDouble();
                    double say3= scan.nextDouble();
                    if (say3==0){
                        System.out.println("payda 0 olamaz");
                    }else {
                        System.out.println("sayilarin bolumunden kalan : "+say4%say3);
                    }
                    break;
                case '^':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("birbirini kuvveti : "+(Math.pow(scan.nextDouble(),scan.nextDouble())));
                    break;
                default:
                    System.out.println("lutfen gecerli bir operator giriniz");

            }
        }
        //while dongusu kullanarak!!!
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        //odev!!!! kullaniciya 5 tahmin hakkı verin bulursa tebrik edin(break atmayi unutmayin) bulamazsa exit atip tekrar oynamasini isteyin

    }
}
