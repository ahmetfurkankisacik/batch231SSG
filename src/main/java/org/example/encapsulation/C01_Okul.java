package org.example.encapsulation;

public class C01_Okul {

    private String okulIsmi="Java ilköğretim okulu";

    private String mudur="Ali Can";

    private String mudurYardimcisi="Veli Can";

    private boolean ozelOkulMu=true;

    private int ogretmenSayisi=20;

    private int ogrenciSayisi=300;

    private int sinifSayisi=20;

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

    @Override
    public String toString() {
        return "C01_Okul{" +
                "okulIsmi='" + okulIsmi + '\'' +
                ", mudur='" + mudur + '\'' +
                ", mudurYardimcisi='" + mudurYardimcisi + '\'' +
                ", ozelOkulMu=" + ozelOkulMu +
                ", ogretmenSayisi=" + ogretmenSayisi +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", sinifSayisi=" + sinifSayisi +
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

    public boolean isOzelOkulMu() {
        return ozelOkulMu;
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
}
