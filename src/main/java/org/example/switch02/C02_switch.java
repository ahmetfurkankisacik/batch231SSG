package org.example.switch02;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {
        // Kullanicidan kacinci ay
        // oldugunu alip mevsimi yazdiran bir
        // switch olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        byte ayNo= scan.nextByte();
        switch (ayNo){
            case 12,1,2:
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
