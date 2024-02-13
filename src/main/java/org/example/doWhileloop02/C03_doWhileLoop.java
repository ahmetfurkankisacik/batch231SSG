package org.example.doWhileloop02;

import java.util.Scanner;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        //  kullanicidan pozitif bir tamsayi alip
        // do while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        //ve bu tamsayilarin toplamını alınız
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();
        int counter=1;
        int toplam=0;
        do {
            if (sayi>0){
                System.out.print(counter+" ");
                toplam+=counter;
            }else {
                System.out.println("lutfen pozitif bir tamsayi girerek tekrar deneyiniz");
            };
            counter++;
        }while (counter<=sayi);
        System.out.println("tamsayilarin toplami : "+toplam);
    }
    /*
    kullanıcı c tusuna basana kadar islem yapmaya devam eden bir hesap makinesi yapınız
    +,-,*,/
     */

}
