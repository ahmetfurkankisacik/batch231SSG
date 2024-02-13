package org.example.wrapperClass_TypeCasting03;

public class C05_wrapperClass {
    public static void main(String[] args) {
        double sayi1=15.7;
        Double sayi2=25.4;

        System.out.println(sayi2.intValue());
        String str="10";
        int sayi3=Integer.parseInt(str);//parseInt ile valueOf'un farkı parseInt int(primitive) dondururken valueOf Integer(wrapperClass'i) dondurur.
        Integer sayi4=Integer.valueOf(str);//parseInt ile valueOf'un farkı parseInt int(primitive) dondururken valueOf Integer(wrapperClass'i) dondurur.
        System.out.println(Double.valueOf(str));


    }
}
