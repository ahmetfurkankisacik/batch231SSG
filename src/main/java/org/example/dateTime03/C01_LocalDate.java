package org.example.dateTime03;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {
         /*
        soru 1)
        -bugunun tarihini obje olusturarak yazdirin
        -bugun yilin kacinci gunu oldugunu yazdirin
        -hangi gunde oldugumuzu yazdirin
        -yılın bitmesine kac gun kaldıgını yazdırın
        -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
        -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
 */
        LocalDate date=LocalDate.now();
        System.out.println(date);//y.a.g
        System.out.println(date.getDayOfYear());//59
        System.out.println(date.isLeapYear());
        System.out.println(366 - date.getDayOfYear());//307
        System.out.println(date.plusYears(3).plusMonths(5).plusDays(7));
        System.out.println(date.plusYears(2).plusMonths(2).plusDays(2));
        System.out.println(date.plusYears(2).plusMonths(2).plusDays(2).getDayOfMonth());
        System.out.println(date.plusYears(2).plusMonths(2).plusDays(2).getMonthValue());
        System.out.println(date.plusYears(7).plusMonths(7).plusDays(7).getDayOfWeek());
        System.out.println(date.plusYears(7).plusMonths(7).plusDays(7));

        LocalDate tarih=LocalDate.of(2025,2,23);
        if (date.isAfter(tarih)){
            System.out.println(tarih);
        }else if (date.isBefore(tarih)){
            System.out.println(date);
        }else {
            System.out.println("tarihler birbirinin aynisidir : "+tarih);
        }

    }
}
