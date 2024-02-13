package org.example.switch01;

import java.util.Scanner;

public class C04_switch {
    public static void main(String[] args) {
        //Ayakkabi Boyutu kontrol etmek için Java Programı
        //switch...case ifadesini kullanarak
        //Boyutu icin size ler: small -Medium- Large- Extra Large-
        //35-50
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 35~50 arasinda ayakkabi numarasi giriniz");
        int ayakkabiNo= (int)scan.nextDouble();

        switch (ayakkabiNo){
            case 35,36,37,38:
                System.out.println("small");
                break;
            case 39,40,41,42:
                System.out.println("medium");
                break;
            case 43,44,45,46:
                System.out.println("large");
                break;
            case 47,48,49,50:
                System.out.println("extra large");
                break;
            default:
                System.out.println("lutfen gecerli bir ayakkabi numarasi giriniz");
                break;
        }

    }
}
