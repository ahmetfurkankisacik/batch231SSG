package org.example.dateTime03;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        //soru 2)
        //-suanin saatini dakikasini ve saniyesini bize dondurun
        //-suanin saniyesini bize dondurun
        // -10000 saniye sonrasini bize dondurun
        //-200 dakika onceki saati bize dondurun
        //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
        LocalTime time=LocalTime.now();
        System.out.println(time);
        System.out.println(time.getSecond());
        System.out.println(time.plusSeconds(10000));
        System.out.println(time.minusMinutes(200));
        System.out.println(time.withHour(3));
        System.out.println(time.withNano(0).withSecond(0));
    }
}
