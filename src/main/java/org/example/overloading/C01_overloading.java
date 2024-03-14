package org.example.overloading;

public class C01_overloading {
    public static void main(String[] args) {
        toplam(1,2);
        toplam(1.5,2);
        toplam(2,3.5);
        toplam(2.5,3.5);

    }//autowiding

    private static void toplam(double a, double b) {
        System.out.println(a+b);
    }

    private static void toplam(int a, double b) {
        System.out.println(a + b);
    }

  //  private static void toplam(double a, int b) {
  //      System.out.println(a+b);
  //  }

    private static void toplam(int a, int b) {
        System.out.println(a+b);
    }
}
