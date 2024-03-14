package org.example.dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime time=LocalDateTime.now();
        System.out.println(time);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd.MM.yyyy\nHH:mm");//gun ay yıl
        System.out.println(dtf.format(time));
    }
}
