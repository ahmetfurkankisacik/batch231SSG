package org.example.overloading01;

import java.util.ArrayList;

public class C02_overLoading {
    public static void main(String[] args) {
        double arr[]={1.9,2.5,3.3,4.2,5.1,6.7};
        int arr1[]={1,2,3,4,5,6};
        toplam(arr);
        toplam(arr1);
        ArrayList<Double>myList1=new ArrayList<>();
        ArrayList<Integer>myList2=new ArrayList<>();
        toplam(myList1);
        toplam(myList2,0);

    }

    private static void toplam(ArrayList<Integer> myList1,int b) {
        int toplam=0;
        for (Integer a:myList1
        ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }

    private static void toplam(ArrayList<Double> myList1) {
        double toplam=0;
        for (Double a:myList1
             ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }

    private static void toplam(int[] arr) {
        int toplam=0;
        for (int a:arr
        ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }

    private static void toplam(double[] arr) {
        double toplam=0;
        for (double a:arr
             ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }
}
