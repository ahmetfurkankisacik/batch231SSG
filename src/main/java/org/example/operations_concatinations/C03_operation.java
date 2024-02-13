package org.example.operations_concatinations;

public class C03_operation {
    public static void main(String[] args) {
        //assagidaki isleme bakiniz ve sonuclari dondurunuz

        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;
                System.out.println(sonuc1);//t
        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;
                System.out.println(sonuc2);//f
        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;
        System.out.println(sonuc3);//f
    }
}
