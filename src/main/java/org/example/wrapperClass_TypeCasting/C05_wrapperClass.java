package org.example.wrapperClass_TypeCasting;

public class C05_wrapperClass {
    public static void main(String[] args) {
        double sayi=15.7;
        Double sayi1=sayi;
        int sayi2= sayi1.intValue();
        //int sayi3=(int)sayi1;
        System.out.println(sayi2);
    //bir string ifadeyi int'a cevir
    String str="10a";
    int num= Integer.parseInt(str);
        System.out.println(num);
    }

}
