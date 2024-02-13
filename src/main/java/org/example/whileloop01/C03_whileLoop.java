package org.example.whileloop01;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=100000;
        while (sayi!=0){

            System.out.println("lutfen toplamak istediginiz sayilari giriniz siz 0'a basıncaya kadar toplamaya devam edicek");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("sayilarin toplami : "+toplam);
    }
}
