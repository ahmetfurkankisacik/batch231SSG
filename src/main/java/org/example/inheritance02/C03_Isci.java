package org.example.inheritance02;

public class C03_Isci extends C02_muhasebe{

    public int saatUcreti=10;//$
    public String statu="işçi";
    public int mesai=8;
    public int izinSayisi=4;

    @Override
    public int maasHesapla() {
        maas=saatUcreti*mesai*(30-izinSayisi)-avans+(fazlaMesai*saatUcreti*2);
        return maas;
    }

    @Override
   public String toString() {
       return "C03_Isci{" +
               "id=" + id +
               ", isim='" + isim + '\'' +
               ", soyIsim='" + soyIsim + '\'' +
               ", telefon='" + telefon + '\'' +
               ", adres='" + adres + '\'' +
               ", mail='" + mail + '\'' +
               ", saatUcreti=" + saatUcreti +
               ", statu='" + statu + '\'' +
               ", mesai=" + mesai +
               ", izinSayisi=" + izinSayisi +
               ", maas=" + maas +
               ", avans=" + avans +
               ", fazlaMesai=" + fazlaMesai +
               '}';
   }
}
