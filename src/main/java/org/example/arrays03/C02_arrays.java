package org.example.arrays03;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
        */
        int arr[]={4,5,2,3,99,87,65,42,56,77};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
