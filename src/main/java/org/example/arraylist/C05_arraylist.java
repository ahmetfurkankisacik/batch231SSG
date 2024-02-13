package org.example.arraylist;

import java.util.ArrayList;
import java.util.List;

public class C05_arraylist {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun
        ArrayList<Integer>myList=new ArrayList<>(List.of(1, 3, 5,13, 3, 5, 6, 1, 7));
        System.out.println(myList);
        tekrarsizListOlustur(myList);
        // bir listede ortalamanin ustunde olan element sayisini bulunuz odev!!!!
    }

    private static void tekrarsizListOlustur(ArrayList<Integer> myList) {
        ArrayList<Integer>tekrarsizList=new ArrayList<>();
        for (Integer a:myList
             ) {
            if (!tekrarsizList.contains(a)){
                tekrarsizList.add(a);
            }
        }
        System.out.println(tekrarsizList);








        // for (int i = 0; i < myList.size(); i++) {
      //     if (myList.indexOf(myList.get(i))==myList.lastIndexOf(myList.get(i))){
      //         //i--;
      //     }else {
      //         myList.remove(myList.get(i));
      //     }
      // }
      // System.out.println(myList);
        }
    }

