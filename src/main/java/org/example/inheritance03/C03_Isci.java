package org.example.inheritance03;

public class C03_Isci extends C02_muhasebe{
    public String statu="Isçi";
    public int saatUcreti=200;
    public int mesai=8;
    public int izin=4;

    @Override
    public int maasAtama() {
        maas=mesai*saatUcreti*(30-izin)+fazlaMesai*saatUcreti*2;
        return maas;
    }

    @Override
    public String toString() {
        return "C03_Isci{" +
                ", id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", email='" + email + '\'' +
                ", statu='" + statu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", mesai=" + mesai +
                ", izin=" + izin +
                ", maas=" + maas +
                ", fazlaMesai=" + fazlaMesai +
                '}';
    }
}
