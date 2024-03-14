package org.example.encapsulation01;

public class C02_Okul {

    private String okulIsmi="TechproEducation";

    private String okulMudur="Ahmet Kısacık";

    private boolean ozelOkulMu=true;

    private String mudurYardimcisi="Serkan Hoca";

    private int ogretmenSayisi=30;

    private int sinifSayisi=20;

    private int digerCalisanSayisi=5;

    public void setOkulMudur(String okulMudur) {
        this.okulMudur = okulMudur;
    }

    public void setOzelOkulMu(boolean ozelOkulMu) {
        this.ozelOkulMu = ozelOkulMu;
    }

    public void setMudurYardimcisi(String mudurYardimcisi) {
        this.mudurYardimcisi = mudurYardimcisi;
    }

    public void setOgretmenSayisi(int ogretmenSayisi) {
        this.ogretmenSayisi = ogretmenSayisi;
    }

    public void setDigerCalisanSayisi(int digerCalisanSayisi) {
        this.digerCalisanSayisi = digerCalisanSayisi;
    }

    public String getOkulIsmi() {
        return okulIsmi;
    }

    public String getOkulMudur() {
        return okulMudur;
    }

    public boolean isOzelOkulMu() {
        return ozelOkulMu;
    }

    public String getMudurYardimcisi() {
        return mudurYardimcisi;
    }

    public int getOgretmenSayisi() {
        return ogretmenSayisi;
    }

    public int getSinifSayisi() {
        return sinifSayisi;
    }

    public int getDigerCalisanSayisi() {
        return digerCalisanSayisi;
    }

    @Override
    public String toString() {
        return "C02_Okul{" +
                "okulIsmi='" + okulIsmi + '\'' +
                ", okulMudur='" + okulMudur + '\'' +
                ", ozelOkulMu=" + ozelOkulMu +
                ", mudurYardimcisi='" + mudurYardimcisi + '\'' +
                ", ogretmenSayisi=" + ogretmenSayisi +
                ", sinifSayisi=" + sinifSayisi +
                ", digerCalisanSayisi=" + digerCalisanSayisi +
                '}';
    }
}
