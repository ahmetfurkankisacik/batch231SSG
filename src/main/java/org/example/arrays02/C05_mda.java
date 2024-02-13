package org.example.arrays02;

public class C05_mda {
    public static void main(String[] args) {
         /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        int arr[][]= {{1,2,3,4},{5,6,7},{8,9}};
        elemanYazdir(arr);

    }

    private static void elemanYazdir(int[][] arr) {

        for (int []a:arr
             ) {
            for (int b:a
                 ) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
