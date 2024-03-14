package org.example.inheritance03;

public class Runner {
    public static void main(String[] args) {
        C03_Isci isci=new C03_Isci();
        isci.isim="ali";
        isci.soyIsim="can";
        isci.maas= isci.maasAtama();
        System.out.println(isci);
    }
}
