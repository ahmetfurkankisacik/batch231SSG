package org.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi girinz");

        try {
            int sayi= scan.nextInt();
            System.out.println(10/sayi);
        } catch (InputMismatchException e) {
            System.out.println("kullanıcı yanlıs bir veri girdi");
        }catch (ArithmeticException e){
            System.out.println("payda 0 olamaz !!!");
        }



    }
}
