package org.example.arraylist03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arraylist {
    public static void main(String[] args) {
        /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        */
        ArrayList<Integer>myList=new ArrayList<>(List.of(1,2,3,4));
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        System.out.println(myList);

    }
}
