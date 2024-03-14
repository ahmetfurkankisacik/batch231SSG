package org.example.dateTime02;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C01_LocalDate {
    public static void main(String[] args) {

        /*
        LocalDate tarih ile ilgili durumlar
        LocalTime saat ile ilgili durumlar
        LocalDateTime tarih ve saat
        DateTimeFormatter saat ve tarih formati icin kullanılan
         */
         /*
         soru 1)
         -bugunun tarihini obje olusturarak yazdirin
         -bugun yilin kacinci gunu oldugunu yazdirin
         -hangi gunde oldugumuzu yazdirin
         -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
         -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
         -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
         -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
       */
        LocalDate date= LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfYear());//59
        System.out.println(date.getDayOfWeek());//wednesday
        System.out.println(date.plusYears(3).plusMonths(5).plusDays(7));
        System.out.println(date.plusYears(3).plusMonths(5).plusDays(7).getDayOfMonth());
        System.out.println(date.plusYears(3).plusMonths(5).plusDays(7).getDayOfWeek());
        LocalDate date2=LocalDate.of(2012,5,25);
        System.out.println(date2);
        if (date.isBefore(date2)){
            System.out.println(date);
        }else if (date.isAfter(date2)){
            System.out.println(date2);
        }else {
            System.out.println("bu iki tarih birbiri ile aynidir : "+date2);
        }


    }
}
