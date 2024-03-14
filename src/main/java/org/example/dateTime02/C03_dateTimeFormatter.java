package org.example.dateTime02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime time=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a dd.MM.yy");
        System.out.println(dtf.format(time));

    }
}
