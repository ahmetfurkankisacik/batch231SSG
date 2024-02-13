package org.example.switch02;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme ,kalan Hesaplama ve us alma
        //yapan basit bir Hesap Makinesi oluşturun:
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen islem yapmak icin ilk sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen islem yapmak istediginiz operatoru giriniz :\ntoplama icin +\ncıkarmak icin -\ncarpmak icin *\nbolmek icin /\nus almak icin ^\nkalan bulmak icin %");
        char operator=scan.next().charAt(0);
        System.out.println("lutfen islem yapmak icin 2. sayiyi giriniz");
        double sayi2= scan.nextDouble();
        switch (operator){
            case '+':
                System.out.println(sayi1 +""+operator+sayi2+" = "+(sayi1+sayi2));
                break;
            case '-':
                System.out.println(sayi1 +""+operator+sayi2+" = "+(sayi1-sayi2));
                break;
            case '/':
                System.out.println(sayi1 +""+operator+sayi2+" = "+(sayi1/sayi2));
                break;
            case '*':
                System.out.println(sayi1 +""+operator+sayi2+" = "+(sayi1*sayi2));
                break;
            case '^':
                System.out.println(sayi1 +""+operator+sayi2+" = "+(Math.pow(sayi1,sayi2)));
                break;
            case '%':
                System.out.println(sayi1 +""+operator+sayi2+" = "+(sayi1%sayi2));
                break;
        }

       //int carpim=1;
       //for (int i = 0; i < sayi2; i++) {
       //    carpim*=sayi1;
       //}
       //System.out.println(carpim);
    }
}
