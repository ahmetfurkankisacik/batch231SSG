package org.example.arrays02;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
         /*
        3.soru Verilen array
        in tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek; array ((1,2,3)) ise output (2, 3, 1) olacak
        */
        String arr[]={"a","b","c"};
        String str=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=str;
        System.out.println(Arrays.toString(arr));

    }
}
