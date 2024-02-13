package org.example.arraylist02;

import java.util.ArrayList;
import java.util.Collections;

public class C02_arraylist {
    public static void main(String[] args) {
        /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        ArrayList<String> sehirler=new ArrayList<>();
        sehirler.add("Izmir");
        sehirler.add("Denizli");
        sehirler.add("Giresun");
        sehirler.add("Erzurum");
        sehirler.add(3,"Manisa");
        sehirler.add("Zonguldak");
       //System.out.println(sehirler);
       Collections.sort(sehirler);
       System.out.println(sehirler);
       //System.out.println(sehirler.get(0));

    }
}
