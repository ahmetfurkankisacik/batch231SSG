package org.example.whileloop03;

public class C01_whileloop {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin
        //1. yol
        System.out.println("5 6 7 8 9 10");
        //2.yol
        for (int i = 5; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //3.yol
        int i=5;
        while (i<11){
            System.out.print(i+" ");
        i++;}
    }
}
