package org.example.switch01;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme ve kalan Hesaplama
        //yapan basit bir Hesap Makinesi oluşturun:
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen işlem yapmak icin ilk sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen islem yapmak istediginiz operatoru giriniz +,*,/,-,%,^");
        char operator=scan.next().charAt(0);
        System.out.println("lutfen islem yapmak icin ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        switch (operator){
            case '+':
                System.out.println(sayi1+""+operator+sayi2+" = "+(sayi1+sayi2));
                break;
            case '*':
                System.out.println(sayi1+""+operator+sayi2+" = "+(sayi1*sayi2));
                break;
            case '/':
                if (sayi2==0){
                    System.out.println("payda 0 olamaz lutfen denemeyiniz!!!");
                }else {
                System.out.println(sayi1+""+operator+sayi2+" = "+(sayi1/sayi2));
                break;
                }
            case '-':
                System.out.println(sayi1+""+operator+sayi2+" = "+(sayi1-sayi2));
                break;
            case '%':
                if (sayi2==0){
                    System.out.println("payda 0 olamaz lutfen denemeyiniz!!!");
                }else {
                System.out.println(sayi1+"'in"+sayi2+"'ye bolumunden kalan : "+(sayi1%sayi2));
                break;
                }
            case '^':
                System.out.println(sayi1+""+operator+sayi2+" = "+(Math.pow(sayi1,sayi2)));
                break;
            default:
                System.out.println("lutfen gecerli bir operator seciniz");
                break;
        }

    }

}
