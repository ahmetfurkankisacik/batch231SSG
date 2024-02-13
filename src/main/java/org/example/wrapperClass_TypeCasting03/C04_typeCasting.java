package org.example.wrapperClass_TypeCasting03;

public class C04_typeCasting {
    public static void main(String[] args) {
        //bir int deger ve bir double degeri toplayin
        //ayni sayilari toplayip sadece tam kismini alin
        int sayi1=15;
        double sayi2=25.7;
        double sayi3=12.4;
        System.out.println(sayi1+sayi2);//autowiding//40,7
        System.out.println((int)(sayi1+sayi2));//40

        System.out.println((int)(sayi2+sayi3));
        System.out.println((int)sayi2+(int)sayi3);


    }
}
