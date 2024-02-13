package org.example.arraylist02;

import java.util.ArrayList;
import java.util.List;

public class C05_arrayList {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun
        ArrayList<Integer>myList=new ArrayList<>(List.of(1, 3, 5, 3, 5, 6, 1 ,6, 7));
        tekrarsizListOlustur(myList);
    }

    private static void tekrarsizListOlustur(ArrayList<Integer> myList) {
        ArrayList<Integer>yeniArrayList=new ArrayList<>();
        for (Integer a:myList
             ) {
            if (!yeniArrayList.contains(a)){
                yeniArrayList.add(a);
            }
        }

        for (int i = 0; i <myList.size() ; i++)
         {
            if (myList.indexOf(myList.get(i))!=myList.lastIndexOf(myList.get(i))){
                myList.remove(myList.get(i));
                i--;
            }
        }
        System.out.println(myList);
        System.out.println(yeniArrayList);

        // bir listede ortalamanin ustunde olan elaman sayisini bulunuz odev!!!!
    }
}
