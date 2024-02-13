package org.example.arrays01;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
         /*
        3.soru Verilen array
        in tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek; array ((1,2,3)) ise output (2, 3, 1) olacak
        */
        String arr[]={"a","b","c","d","e","f"};
        String ilkkarakter=arr[0];
      //  String sonKarakter=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1]=arr[i+1];
            System.out.println(Arrays.toString(arr));
        }
        arr[arr.length-1]=ilkkarakter;
        System.out.println(Arrays.toString(arr));

       // for (int i = arr.length-1 ;i >0; i--) {
       //     arr[i]=arr[i-1];
       //     System.out.println(Arrays.toString(arr));
       // }
       // arr[0]=sonKarakter;
       // System.out.println(Arrays.toString(arr));
       // arr[0]=sonKarakter;
       // System.out.println(Arrays.toString(arr));
    }}
