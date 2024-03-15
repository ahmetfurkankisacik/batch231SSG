package org.example.encapsulation02;

public class C01_Okul {

    private String okulIsmi="TechproEducation";

    private String mudur="Ahmet Kısacık";

    private String mudurYardimcisi="Gökhan Akyar";

    private int ogretmenSayisi=45;

    private int ogrenciSayisi=900;

    private int sinifSayisi=25;

    private int digerPersonelSayisi=10;

    public void setOkulIsmi(String okulIsmi) {
        this.okulIsmi = okulIsmi;
    }

    public void setMudur(String mudur) {
        this.mudur = mudur;
    }

    public void setMudurYardimcisi(String mudurYardimcisi) {
        this.mudurYardimcisi = mudurYardimcisi;
    }

    public void setOgretmenSayisi(int ogretmenSayisi) {
        this.ogretmenSayisi = ogretmenSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public void setSinifSayisi(int sinifSayisi) {
        this.sinifSayisi = sinifSayisi;
    }

    public void setDigerPersonelSayisi(int digerPersonelSayisi) {
        this.digerPersonelSayisi = digerPersonelSayisi;
    }

    @Override
    public String toString() {
        return "C01_Okul{" +
                "okulIsmi='" + okulIsmi + '\'' +
                ", mudur='" + mudur + '\'' +
                ", mudurYardimcisi='" + mudurYardimcisi + '\'' +
                ", ogretmenSayisi=" + ogretmenSayisi +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", sinifSayisi=" + sinifSayisi +
                ", digerPersonelSayisi=" + digerPersonelSayisi +
                '}';
    }

    public String getOkulIsmi() {
        return okulIsmi;
    }

    public String getMudur() {
        return mudur;
    }

    public String getMudurYardimcisi() {
        return mudurYardimcisi;
    }

    public int getOgretmenSayisi() {
        return ogretmenSayisi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public int getSinifSayisi() {
        return sinifSayisi;
    }

    public int getDigerPersonelSayisi() {
        return digerPersonelSayisi;
    }
}
