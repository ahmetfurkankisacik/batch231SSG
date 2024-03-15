package org.example.exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi gir");
        try {
            int sayi= scan.nextInt();
            System.out.println(10/sayi);
        } catch (InputMismatchException e) {
            System.out.println("deger atamasında bir sorun var");
        }catch (ArithmeticException e){
            System.out.println("payda 0 olamaz");
        }catch (Exception e){
            System.out.println("lutfen dikkat ediniz");
        }
        System.out.println("try catch blogundan sonra");

    }
}
