package org.example.inheritance02;

public class C01_IK {

    public static int sayac=100;

    public int id;

    public String isim;
    public String soyIsim;
    public String telefon;
    public String adres;
    public String mail;

    public C01_IK(){
        System.out.println("insan kaynaklarındaki cons calisti");
        id=sayac;
        sayac++;
    }
}
