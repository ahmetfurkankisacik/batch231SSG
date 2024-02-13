package org.example.doWhileloop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcı c tusuna basana kadar islem yapmaya devam eden bir hesap makinesi yapınız
         */
        Scanner scan=new Scanner(System.in);
        char operator;

        do {
            System.out.println("lutfen islem yapmak icin +,-,*,/,%,^ islemlerinden birini seciniz siz c tusuna basana kadar islem yapmaya devam edicek");
            operator=scan.next().charAt(0);
            switch (operator){
                case '+':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin toplami : "+(scan.nextDouble()+ scan.nextDouble()));
                    break;
                case '-':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin farki : "+(scan.nextDouble()- scan.nextDouble()));
                    break;
                case '*':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin carpimi : "+(scan.nextDouble()* scan.nextDouble()));
                    break;
                case '/':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin bolumu : "+(scan.nextDouble()/ scan.nextDouble()));
                    //payda 0 olamaz bunun kontrolunu yapınız odev!!!
                    break;
                case '%':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin bolumunden kalan : "+(scan.nextDouble()% scan.nextDouble()));
                    //payda 0 olamaz bunun kontrolunu yapınız odev!!!
                    break;
                case '^':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin kuvveti : "+Math.pow(scan.nextDouble(), scan.nextDouble()));
                    break;
                default:
                    System.out.println("lutfen gecerli bir operator giriniz");
                break;
                case 'c':
                    System.out.println("bizi tercih ettiginiz icin tesekkurler tekrar bekleriz");
                    break;
            }

        }while (operator!='c');
    }
}
