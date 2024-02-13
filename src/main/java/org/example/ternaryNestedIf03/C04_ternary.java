package org.example.ternaryNestedIf03;

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
        System.out.println("lutfen bir harf giriniz");
        String str= scan.nextLine().toLowerCase();
        str=str.replaceAll("[^a-z]","*");
        str=str.replaceAll("[aeiou]","i");

        if (str.length()==1&&!str.contains("*")){
           if (str.equals("i")){
               System.out.println("sesli harftir");
           }else {
               System.out.println("sessiz harftir");
           }
        }else {
            System.out.println("yanlıs ya da fazla harf girdiniz");
        }
        System.out.println(str.length() == 1 && !str.contains("*") ? str.equals("i") ? "sesli harftir" : "sessiz harftir" : "yanlıs ya da fazla harf girdiniz");



    }
}
