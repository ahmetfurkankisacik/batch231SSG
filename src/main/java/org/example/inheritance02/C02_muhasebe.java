package org.example.inheritance02;

public class C02_muhasebe extends C01_IK{

    public int maas;

    public int saatUcreti;

    public int mesai;

    public String statu;

    public int avans;

    public int izinSayisi;

    public int fazlaMesai;

    public int maasHesapla(){
       maas=saatUcreti*mesai*(30-izinSayisi)-avans+(fazlaMesai*saatUcreti*2);
       return maas;
    }


}
