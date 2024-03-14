package org.example.overloading;

public class C02_overloading {
    public static void main(String[] args) {
        double arr[]={1.2,3.6,5.7};
        int arr1[]={1,3,5};
        carpim(arr);
        carpim(arr1);

    }

    private static void carpim(int[] arr1) {
        int carpim=1;
        for (int a:arr1
        ) {
            carpim*=a;
        }
        System.out.println(carpim);

    }

    private static void carpim(double[] arr) {
        double carpim=1;
        for (double a:arr
             ) {
            carpim*=a;
        }
        System.out.println(carpim);
    }
}
