package org.example.overloading02;

public class C04_telefon {
    String marka;
    String model;
    String yil;
    int hafiza;
    public C04_telefon(String marka){
        this.marka=marka;
    }
    public C04_telefon(String marka ,String model){
        this.marka=marka;
        this.model=model;
    }
    public C04_telefon(String marka,String model,String yil){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }

    public C04_telefon(String marka, String model, int hafiza) {
        this.marka = marka;
        this.model = model;
        this.hafiza = hafiza;
    }

    public C04_telefon(String marka, String model, String yil, int hafiza) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.hafiza = hafiza;
    }

}
