package org.example.overloading;

public class C03_telefon {
    String marka;
    String model;
    String renk;
    String boyut;
    int fiyat;
    int depolama;

    public C03_telefon() {
        System.out.println("parametresiz");
    }

    public C03_telefon(String marka) {
        this.marka = marka;
    }

    public C03_telefon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public C03_telefon(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public C03_telefon(String marka, String model, String renk) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
    }

    public C03_telefon(String marka, String model, String renk, String boyut, int fiyat, int depolama) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.boyut = boyut;
        this.fiyat = fiyat;
        this.depolama = depolama;
    }

    public C03_telefon(String marka, int fiyat) {
        this.marka = marka;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "C03_telefon{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", boyut='" + boyut + '\'' +
                ", fiyat=" + fiyat +
                ", depolama=" + depolama +
                '}';
    }

    public static void main(String[] args) {
        C03_telefon telefon1=new C03_telefon("Iphone","15 pro MAX","Mor");
        System.out.println(telefon1);

    }
    //Girilen String bir ifadenin harfleri yer değiştirilerek
    //oluşturulabilecek anlamlı anlamsız bütün kelimeleri alt alta gösteren bir program yazınız
    //String a="ahmet";


}
