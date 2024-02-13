package org.example.ifstatements02;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
         /*
        kullanicidan 2 sayi isteyip sonrasinda yapmak istedigi islemi sectirip kucuk bir hesap makinesi yapin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tane sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("lutfen toplamak icin : +\ncarpmak icin : *\nbolmek icin : /\ncikarmak icin : -");
        String operator=scan.next();
        if (operator.equals("+")){
            System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        } else if (operator.equals("-")) {
            System.out.println("sayilarin farki : "+(sayi1-sayi2));
        } else if (operator.equals("*")) {
            System.out.println("sayilarin carpimi : "+sayi1*sayi2);
        } else if (operator.equals("/")) {
            if (sayi2==0){
                System.out.println("payda 0 olamaz!!!");
            }else {
            System.out.println("sayilarin bolumu : "+sayi1/sayi2);}
        }else {
            System.out.println("lutfen gecerli bir operator giriniz!!");
        }
    }
}
