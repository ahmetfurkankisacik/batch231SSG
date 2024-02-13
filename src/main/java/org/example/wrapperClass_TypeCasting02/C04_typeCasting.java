package org.example.wrapperClass_TypeCasting02;

public class C04_typeCasting {
    public static void main(String[] args) {
        //bir int deger ve bir double degeri toplayin
        //ayni sayilari toplayip sadece tam kismini alin
        int sayi1=25;
        double sayi2=14.7;
        System.out.println(sayi2 + sayi1);
        System.out.println((int) (sayi2+sayi1));
        System.out.println((int)sayi2+sayi1);
    }
}
