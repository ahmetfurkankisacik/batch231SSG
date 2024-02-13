package org.example.doWhileLoop03;

import java.util.Scanner;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        //  kullanicidan pozitif bir tamsayi alip
        //  sayidan kucuk pozitif tamsayilari yazdiralim
        //  ve bu tamsayilarin toplamını alınız
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;
       // int counter=1;
       // do {
       //     if (sayi>0){
       //         System.out.print(counter+" ");
       //         toplam+=counter;
       //     }else  {
       //         System.out.println("lutfen pozitif bir tam sayi girerek tekrar deneyiniz");
       //     }
//
       // counter++
       // ;}while (counter<=sayi);
       // System.out.println("toplamlari : "+toplam);

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(i+" ");
            toplam+=i;
        }
        System.out.println(toplam);
     /*
     kullanıcı c tusuna basana kadar islem yapmaya devam eden bir hesap makinesi yapınız
     */
    }
}
