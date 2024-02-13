package org.example.arrays03;

public class C02_mda {
    public static void main(String[] args) {
         /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        int sayilar[][]={{1,3,5,7,9,11},{2,4,6,8,10},{12,13,14,15,16}};
        elemanYazdir(sayilar);
    }

    private static void elemanYazdir(int[][] sayilar) {
        for (int arr[]:sayilar
             ) {
            for (int a:arr
                 ) {
                System.out.print(a+" ");
            }
        }
    }
}
