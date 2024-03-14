package org.example.inheritance01;

public class C03_Isci extends C02_muhasebe{

    public int saatUcreti=100;
    public int mesai=9;
    public String statu="Işçi";

    @Override
    public int maasHesapla() {
        maas=mesai*saatUcreti*(30-izinGun)+(fazlaMesai*saatUcreti*2)-avans+yolUcreti+sosyalYardim;
        return maas;
    }

    @Override
    public String toString() {
        return "C03_Isci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", mesai=" + mesai +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", mesai=" + mesai +
                ", sosyalYardim=" + sosyalYardim +
                ", fazlaMesai=" + fazlaMesai +
                ", avans=" + avans +
                ", izinGun=" + izinGun +
                '}';
    }
}
