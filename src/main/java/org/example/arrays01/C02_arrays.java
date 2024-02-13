package org.example.arrays01;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
        */
        int sayilar[]={7,15,4,19,8,12,98,33,21,105,78,0,63};
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }}
