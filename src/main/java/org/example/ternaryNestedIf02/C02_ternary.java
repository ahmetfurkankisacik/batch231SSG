package org.example.ternaryNestedIf02;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin tek mi cift mi kontrol edin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi girinz");
        int sayi= scan.nextInt();
        System.out.println(sayi % 2 == 0 ? "sayi cifttir" : "sayi tektir");
        //String str=sayi % 2 == 0 ? "sayi cifttir" : "sayi tektir";

    }
}
