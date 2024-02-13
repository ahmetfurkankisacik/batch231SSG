package org.example.arrays01;




public class C06_mda {
    public static void main(String[] args) {

         /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        String[][]arr={{"ali","veli"},{"ömer","faruk"},{"ahmet","furkan"}};
        elamanYazdir(arr);
    }

    public static void elamanYazdir(String[][] arr) {
        for (String[] w:arr
             ) {
            for (String a:w
                 ) {
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
}
