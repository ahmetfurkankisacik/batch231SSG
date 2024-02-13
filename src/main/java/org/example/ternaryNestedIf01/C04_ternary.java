package org.example.ternaryNestedIf01;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1 harf giriniz");
        String karakter=scan.next().toLowerCase();
        karakter=karakter.replaceAll("[^a-z]","£");
        karakter=karakter.replaceAll("[aeiou]","e");

       //if (karakter.length()==1&&!karakter.contains("£")){
       //    System.out.println(karakter.equals("e") ? "sesli harftir" : "sessiz harftir");
       //}else {
       //    System.out.println("yanlış ya da fazla harf girdiniz");
       //}
        String str=karakter;
        System.out.println(str.length()==1&&!str.contains("£") ?(str.equals("e")? "Sesli harftir":"Sessiz Harftir") :"yanlıs ya da fazla harf girdiniz");


    }
}
