package org.example.overloading02;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.next();
        String str1= scan.next();
        C04_telefon telefon=new C04_telefon(str);
        telefon.marka=str;
        telefon.model=str1;


    }
}
