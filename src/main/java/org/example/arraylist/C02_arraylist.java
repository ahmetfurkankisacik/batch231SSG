package org.example.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class C02_arraylist {
    public static void main(String[] args) {
        /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        ArrayList<String>myList=new ArrayList<>();
        myList.add("Ankara");
        myList.add("Izmir");
        myList.add("Istanbul");
        myList.add("Bursa");
        myList.add("Manisa");
        //myList.sort(null);
        Collections.sort(myList);
        System.out.println(myList);

    }
}
