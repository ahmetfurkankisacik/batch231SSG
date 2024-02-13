package org.example.arrays03;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
        /*
    1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
    */
        String[]str1={"ali can","ömer faruk","ankara"};
        String[]str2={"ali can","ömer faruk","ankara"};
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        System.out.println(Arrays.equals(str1, str2));
    }
}
