package org.example.forloop01;

public class C06_forloop {
    public static void main(String[] args) {
        //carpim tablosu olusturunuz
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i+" * "+j+" = "+i*j+" | ");
            }
            System.out.println();
        }
    }
}
