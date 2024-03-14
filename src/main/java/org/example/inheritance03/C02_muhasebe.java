package org.example.inheritance03;

public class C02_muhasebe extends C01_IK{
    public int maas;
    public int izin;
    public String statu;
    public int mesai;
    public int fazlaMesai;
    public int saatUcreti;
    public int maasAtama(){
        maas=mesai*saatUcreti*(30-izin)+fazlaMesai*saatUcreti*2;
        return maas;
    }
}
