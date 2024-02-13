package org.example.wrapperClass_TypeCasting;

public class C04_typeCasting {
    public static void main(String[] args) {
        //bir int deger ve bir double degeri toplayin
        //ayni sayilari toplayip sadece tam kismini alin
        int sayi1=5;
        double sayi2=12.7;
        System.out.println(sayi1+sayi2);
        System.out.println((int) (sayi1+sayi2));
        System.out.println(sayi1+(int) sayi2);

    }
}
