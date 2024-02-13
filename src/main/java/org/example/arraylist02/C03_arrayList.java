package org.example.arraylist02;

import java.util.ArrayList;

public class C03_arrayList {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        ArrayList<Integer>myList=new ArrayList<>();
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        int toplam=0;
        for (Integer a:myList
             ) {
            toplam+=a;
        }
        System.out.println(toplam);


    }

}
