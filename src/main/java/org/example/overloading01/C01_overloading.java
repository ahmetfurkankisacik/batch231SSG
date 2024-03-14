package org.example.overloading01;

public class C01_overloading {
    public static void main(String[] args) {
        carpim(5,7);
        carpim(5.5,8);
        carpim(6,1.2);
        carpim(5.6,6.5);
        carpim(5.6,6.7,8.8);
    }
    private static void carpim(double a, double b, double c) {
        System.out.println(a * b * c);

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
