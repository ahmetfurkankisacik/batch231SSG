package org.example.switch03;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        //yapan basit bir Hesap Makinesi oluşturun:
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen islem yapmak icin 1. sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen islem yapmak istediginiz operatoru giriniz :\ntoplama icin : +\ncıkarma icin : -\nbolmek icin : /\ncarpmak icin : *\nkalan hesaplama icin : %\nus almak icin : ^");
        char operator=scan.next().charAt(0);
        System.out.println("lutfen islem yapmak icin 2. sayiyi giriniz");
        double sayi2= scan.nextDouble();
        switch (operator) {
            case '+':
                System.out.println(sayi1 + "" + operator + sayi2 + " = " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println(sayi1 + "" + operator + sayi2 + " = " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println(sayi1 + "" + operator + sayi2 + " = " + (sayi1 * sayi2));
                break;
            case '/':
                if (sayi2 == 0) {
                    System.out.println("payda 0 olamaz!!!");
                } else {
                    System.out.println(sayi1 + "" + operator + sayi2 + " = " + (sayi1 / sayi2));
                    break;
                }
            case '%':
                if (sayi2 == 0) {
                    System.out.println("payda 0 olamaz!!!");
                } else{
                    System.out.println(sayi1 + "" + operator + sayi2 + " = " + (sayi1 % sayi2));
                }
                break;
            case '^':
                if (sayi1==0&&sayi2==0){
                    System.out.println("bu kavram tanımsız lutfen baska bir işlem yapınız");
                }else {
                    System.out.println(sayi1 + "" + operator + sayi2 + " = " + (Math.pow(sayi1, sayi2)));

                }
                break;
            default:
                System.out.println("lutfen gecerli bir operator giriniz");
        }
      //  int sayi3=5;
      //  int sayi4=3;
      //  int carpim=1;
      //  for (int i = 1; i <=sayi4 ; i++) {
      //      carpim*=sayi3;
      //  }
      //  System.out.println(carpim);
        
    }
}
