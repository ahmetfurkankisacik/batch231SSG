package org.example.encapsulation;

public class Runner {
    public static void main(String[] args) {
        C01_Okul okul=new C01_Okul();
        C01_Okul okul2=new C01_Okul();
        okul.setOkulIsmi("Phyton ilköğretim okulu");
        System.out.println(okul.isOzelOkulMu());
        System.out.println(okul);
        System.out.println(okul2);
    }
}
