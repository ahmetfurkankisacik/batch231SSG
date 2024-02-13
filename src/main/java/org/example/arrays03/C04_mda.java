package org.example.arrays03;

import java.util.Arrays;

public class C04_mda {
    public static void main(String[] args) {
        /*
        soru 1)  bir multi-dimensional array olusturun
        ve olusturdugunuz arrayin elemanlarini yazdırınız
         */
        int arr[][]={{1,2,3,4},{5,6,7},{8,9}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
    }
}
