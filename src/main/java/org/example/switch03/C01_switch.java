package org.example.switch03;

import java.util.Scanner;

public class C01_switch {
    public static void main(String[] args) {
        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ay numarasi giriniz");
        byte ayNo= scan.nextByte();
       String arr[][]={{"ocak","subat","aralık"},{"mart","nisan","mayis"}};
       if (ayNo>=0&&ayNo<2){
           System.out.println("kış");
           System.out.println(arr[0][ayNo - 1]);
       }
           //System.out.println(arr[ayNo-1]);
        switch (ayNo){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("lutfen gecerli bir ay no giriniz");
                break;
        }
    }
}
