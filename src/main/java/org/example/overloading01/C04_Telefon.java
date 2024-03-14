package org.example.overloading01;

public class C04_Telefon {
    String marka;
    String model;
    String renk;
    String kamera;
    int hafiza;

    public C04_Telefon(String marka){
        this.marka=marka;
    }
    public C04_Telefon(String marka,String model){
        this.marka=marka;
        this.model=model;
    }
    public C04_Telefon(String marka,String model,String kamera){
        this.marka=marka;
        this.model=model;
        this.kamera=kamera;
    }



    public static void main(String[] args) {

    }
}
