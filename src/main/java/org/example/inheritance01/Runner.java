package org.example.inheritance01;

public class Runner {
    public static void main(String[] args) {
        C03_Isci isci =new C03_Isci();


        isci.isim="Ali";
        isci.soyIsim="Can";
        isci.mesai=8;
        isci.fazlaMesai=0;
        isci.izinGun=2;
        isci.avans=10000;
        isci.maas=isci.maasHesapla();
                System.out.println(isci);
    }
}
