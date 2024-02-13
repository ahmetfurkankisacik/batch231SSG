package org.example.arrays02;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
    /*
    1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
    */
        int arr1[]={3,5,7,9};
        int arr2[]={3,5,7,9};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1 == arr2);//false
        System.out.println(Arrays.equals(arr1, arr2));//true

    }
}
