package org.example.dateTime03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime bugun=LocalDateTime.now();
        System.out.println(bugun);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd.MMM.yyyy\nhh:mm:ss.n a");
        System.out.println(dtf.format(bugun));

         /*
    odev!!!
        soru 3)
        bize bugunun tarihini ve su anki saati dondurun
        bize 3 ay 100 saat sonraki tarih ve saati dondurun
        bize 100 gun once 100 saat sonraki tarihi dondurun
        bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
        bize sadece bugunun tarihi dondurun
         //LocalDateTime kullanarak yapın tum hepsini
         */
    }
}
