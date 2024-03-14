package org.example.inheritance01;

public class C02_muhasebe extends C01_IK{
    public int maas;

    public int mesai;

    public int sosyalYardim;

    public String statu;

    public int yolUcreti;

    public int saatUcreti;

    public int fazlaMesai;

    public int avans;

    public int izinGun;

    public int maasHesapla(){
        maas=mesai*saatUcreti*(30-izinGun)+(fazlaMesai*saatUcreti*2)-avans+yolUcreti+sosyalYardim;
        return maas;
    }
}
