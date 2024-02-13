package org.example.wrapperClass_TypeCasting;

import java.util.Scanner;

public class C02_typeCasting {
    public static void main(String[] args) {
        //kullanicidan aldiginiz bir sayinin ascii degerine gore karakterini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
       // int sayi= scan.nextInt();
       // char chr=(char) sayi;

        char chr=(char)scan.nextInt();
        System.out.println(chr);

    }
}
