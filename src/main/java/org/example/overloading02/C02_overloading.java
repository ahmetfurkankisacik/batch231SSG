package org.example.overloading02;

import java.util.ArrayList;

public class C02_overloading {
    public static void main(String[] args) {
        int arr[]={7,6,5,4};
        double arr1[]={2.4,5.6,5.3};
        toplam(arr);
        toplam(arr1);

        ArrayList<Double>myList=new ArrayList<>();
        ArrayList<Integer>myList1=new ArrayList<>();
        toplam(myList1);
        //toplam(myList,0);
    }

   // private static void toplam(ArrayList<Double> myList,int a) {
   //
   // }

    private static void toplam(ArrayList<Integer> myList1) {
        int toplam=0;
        for (int a:myList1
             ) {
            toplam+=a;
        }
    }


    private static void toplam(int[] arr) {
        int toplam=0;
        for (int a:arr
             ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }

    private static void toplam(double[] arr1) {
        double toplam=0;
        for (double a:arr1
             ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }
}
