package org.example.ternaryNestedIf02;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {
        /* 2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        en az Biri negatifse ve en az biri 0 ise "çarpma nasıl yapılır bilmiyorum"
        */
        int sayi1=5;
        int sayi2=-1;
        System.out.println(sayi1>0&&sayi2>0?sayi2*sayi1:"carpma nasıl yapılır bilmiyorum");
        //iki sayının işareti aynı ise ise bu sayıları çarpan ,işaretleri farklı ise
        // "farklı işaretli sayıları çarpamam" yazan kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayınızı giriniz");
        double s1 = input.nextDouble();
        System.out.println("lütfen inkinci ssayınıızı giriniz");
        double s2 = input.nextDouble();
        Object carpim =s1*s2>0? String.format("%.3f",s1*s2 ): "farklı işaretli saayıları çarpamam";
        System.out.println("carpim = " + carpim);
    }
}
