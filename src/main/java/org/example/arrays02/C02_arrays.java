package org.example.arrays02;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */
        int arr[]={11,25,32,15,14,7,6,19};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
