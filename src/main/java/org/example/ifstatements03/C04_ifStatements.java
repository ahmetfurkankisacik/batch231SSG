package org.example.ifstatements03;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
       /*
       kullanicidan 2 sayi isteyip sonrasinda yapmak istedigi islemi sectirip kucuk bir hesap makinesi yapin
       */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz");
        int num1=input.nextInt();

        System.out.println("lutfen toplamak icin : +\ncarpmak icin : *\nbolmek icin : /\ncikarmak icin : -\nislemlerinden birini seciniz");
        String operator=input.next();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int num2= input.nextInt();
        if (operator.equals("*")){
            System.out.println("sayilarin carpimi : "+num1*num2);
        } else if (operator.equals("-")) {
            System.out.println("sayilarin farki : "+(num1-num2));
        }else if (operator.equals("+")){
            System.out.println("sayilarin toplami : "+(num1+num2));
        } else if (operator.equals("/")) {
            if (num2==0){
                System.out.println("payda 0 olamaz");
            }else {
                System.out.println("sayilarin bolumu : " + num1 / num2);
            }
        }else {
            System.out.println("lutfen gecerli bir islem seciniz");
        }
    }
}
