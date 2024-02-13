package org.example.arraylist;

import java.util.ArrayList;

public class C03_arraylist {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        ArrayList<Integer> mylist=new ArrayList<>();
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);
        int sum=0;
        for (Integer a:mylist
             ) {
            sum+=a;

        }
        System.out.println(sum);
    }}
