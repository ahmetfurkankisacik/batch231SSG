package org.example.ifstatements01;

import java.util.Scanner;

public class C04_ifstatements {
    public static void main(String[] args) {
         /*
        kullanicidan 2 sayi isteyip sonrasinda yapmak istedigi islemi sectirip kucuk bir hesap makinesi yapin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("lutfen toplamak icin : +\ncarpmak icin : *\nbolmek icin : /\ncikarmak icin : -");
        String operator=scan.next();
        if (operator.equals("+")){
            System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        } else if (operator.equals("*")) {
            System.out.println("sayilari carpimi : "+(sayi1*sayi2));
        } else if (operator.equals("/")) {
           if (sayi2==0){
               System.out.println("payda 0 olamaz");
           }else {
            System.out.println("sayilarin bolumu : "+sayi1/sayi2);
            }
        } else if (operator.equals("-")) {
            System.out.println("sayilari farki : "+(sayi1-sayi2));
        }else {
            System.out.println("lutfen dogru bir operator seciniz");
        }//mod alma eklenecek odev!!!!

    }
}
