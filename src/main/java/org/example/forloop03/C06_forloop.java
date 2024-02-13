package org.example.forloop03;

public class C06_forloop {
    public static void main(String[] args) {

        //carpim tablosu olusturunuz(10x10'luk)
        for (int sayi = 1; sayi <=10 ; sayi++) {
            for (int i = 1; i <=10 ; i++) {
                System.out.print(sayi+" * "+i+" = "+sayi*i+" | ");
            }
            System.out.println();
        }

    }
}
