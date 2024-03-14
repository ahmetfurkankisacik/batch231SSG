package org.example.dateTime03;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class C03_period {
    public static void main(String[] args) {
         /*
        iki tarih arasindaki farki alma
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dogum tarihinizi giriniz yil ay gun olarak");
        int yil= scan.nextInt(),ay= scan.nextInt(),gun= scan.nextInt();
        LocalDate tarih=LocalDate.of(yil,ay,gun);
        LocalDate bugun=LocalDate.now();
        Period period=Period.between(tarih,bugun);
        System.out.println(period);
        System.out.println("arasinda yıl farkı: "+period.getYears());
        System.out.println("arasinda ay farkı: "+period.getMonths());
        System.out.println("arasinda gun farkı: "+period.getDays());

    }
}
