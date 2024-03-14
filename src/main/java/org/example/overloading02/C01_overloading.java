package org.example.overloading02;

public class C01_overloading {


    public static void main(String[] args) {
        carpim(5,6);
        carpim(5.6,7);
        carpim(7,5.6);
        carpim(6.5,7.4);
    }

    private static void carpim(double a, double b) {
        System.out.println(a * b);
    }

    private static void carpim(int a, double b) {
        System.out.println(a * b);
    }

    private static void carpim(double a, int b) {
        System.out.println(a * b);
    }

    private static void carpim(int a, int b) {
        System.out.println(a*b);
    }
}
