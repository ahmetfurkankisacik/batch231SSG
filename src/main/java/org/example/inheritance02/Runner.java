package org.example.inheritance02;

public class Runner {
    public static void main(String[] args) {
        C03_Isci alican=new C03_Isci();
        alican.isim="Ali";
        alican.soyIsim="Can";
        alican.mesai=9;
        alican.maas= alican.maasHesapla();
        System.out.println(alican);
    }
}
