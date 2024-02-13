package org.example.arraylist02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C04_arrayList {
    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
         */
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer>sayiListesi=new ArrayList<>();
        Random rnd=new Random();
        int sayi;
        for (int i = 0; i <200; i++) {
            sayi= rnd.nextInt(801,1001);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }else {
                i--;
            }

        }
        System.out.println(sayiListesi);
        System.out.println(sayiListesi.size());
        System.out.println("lutfen listede kontrol etmek istediginiz sayiyi giriniz");
        int kullaniciSayi= scan.nextInt();
        if (sayiListesi.contains(kullaniciSayi)){
            //System.out.println(sayiListesi.indexOf(sayi));
            System.out.println("evet listede bulunmaktadir");
        }else{
            System.out.println("hayir listede bulunmaktadir");
        }
    }
}
