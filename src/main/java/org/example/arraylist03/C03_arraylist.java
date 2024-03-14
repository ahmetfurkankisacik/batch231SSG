package org.example.arraylist03;

import java.util.ArrayList;
import java.util.List;

public class C03_arraylist {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        ArrayList<Integer> myList=new ArrayList<>();
       // int arr[]=new int[5];
       //myList.add(5);
       //myList.add(6);
       //myList.add(7);
       //myList.add(8);
       //myList.add(9);
       //myList.add(10);
        int sum=0;
        for (Integer a:myList
             ) {
            System.out.println("donguye girdi mi?");
         sum+=a;
        }
        System.out.println(sum);
    }
}
