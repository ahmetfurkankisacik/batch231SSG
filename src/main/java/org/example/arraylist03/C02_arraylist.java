package org.example.arraylist03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_arraylist {
    public static void main(String[] args) {
         /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        ArrayList<String>sehirler=new ArrayList<>(List.of("Izmir","Van","Urfa"));
        Collections.sort(sehirler);
        Collections.reverse(sehirler);
        //sehirler.sort(null);
        System.out.println(sehirler);

    }
}
