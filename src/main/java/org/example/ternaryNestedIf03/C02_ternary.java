package org.example.ternaryNestedIf03;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin tek mi cift mi kontrol edin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi % 2 == 0 ? "sayi cifttir" : "sayi tektir");

    }
}
