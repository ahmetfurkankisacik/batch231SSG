package org.example.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C04_arraylist {
    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
         */
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer>sayilar=new ArrayList<>();
        Random rnd=new Random();
        int sayi;
        while (sayilar.size()<200){
            sayi= rnd.nextInt(1001);
            if (!sayilar.contains(sayi)){

            sayilar.add(sayi);
            }
        }
        System.out.println(sayilar);
        System.out.println("lutfen sayi listesinde olup olmadigini kontrol etmek icin bir sayi giriniz");
        sayi= scan.nextInt();
        if (sayilar.contains(sayi)){
            System.out.println("evet listede bulunmaktadir");
        }else {
            System.out.println("hayır listede bulunmamaktadir");
        }
    }
}
