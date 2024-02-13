package org.example.arrays01;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
    /*
    1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
    */
       int arr1[]={1,2,3,4,5,6,7,8};
       int arr2[]={1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2);
        System.out.println(arr1 == arr2);//true //false(cunku == referans noktasina bakar)
        System.out.println(Arrays.equals(arr1, arr2));//true

    }
}
