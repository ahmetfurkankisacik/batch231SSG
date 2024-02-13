package org.example.ifstatements03;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin
        //ve sayinin tek veya cift oldugunu yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi=input.nextInt();
        if (sayi%2==0){
            System.out.println("sayimiz cifttir");
        }else {
            System.out.println("sayimiz tektir");
        }

    }
}
