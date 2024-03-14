package org.example.encapsulation01;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
     //  C02_Okul okul=new C02_Okul();
     //  okul.setOkulMudur("Merve Yüksek Tekin");
     //  String str="Ali can";
     //  System.out.println(str.replace("a", "e"));
     //  str=str.replace("a","e");
        int sayi=5;
        System.out.println(carpim(sayi));
        System.out.println(sayi);
        int arr[]={1,2,3,4,5,6};
        System.out.println(arr);
        arrayDegistir(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);


        //  StringBuilder stringBuilder=new StringBuilder("Ali can");
      //  stringBuilder.replace(5,6,"e");
      //  System.out.println(stringBuilder);
      //  System.out.println(str);
        // okul.setOgretmenSayisi(25);
       // System.out.println(okul);
    }

    private static void arrayDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);

    }

    private static int carpim(int sayi) {
        sayi=sayi*3;
        System.out.println(sayi);
        return sayi;
    }
}
