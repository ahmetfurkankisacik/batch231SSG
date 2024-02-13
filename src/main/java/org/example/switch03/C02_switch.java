package org.example.switch03;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {
        // Kullanicidan kacinci ay
        // oldugunu alip mevsimi yazdiran bir
        // switch olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ay no giriniz");
        byte ayNo= scan.nextByte();
        switch (ayNo){
            case 12:
                //System.out.println("aralık");
            case 1:
                // System.out.println("ocak");
            case 2:
                // System.out.println("subat");
                System.out.println("kış");
                break;
            case 3,4,5:
                System.out.println("ilkbahar");
                break;
            case 6,7,8:
                System.out.println("yaz");
                break;
            case 9,10,11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("lutfen gecerli bir ay no giriniz");
                break;
        }

    }
}
