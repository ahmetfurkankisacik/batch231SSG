package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramKelime {
    // Yardımcı fonksiyon: Bir stringin karakterlerini sıralar
    public static String sirala(String str) {
        char[] karakterler = str.toCharArray();
        Arrays.sort(karakterler);
        return new String(karakterler);
    }

    // Yardımcı fonksiyon: Girilen stringin tüm anagramlarını bulur
    public static void anagramlariBul(String str) {
        // Girilen stringin karakter dizisi ve uzunluğu
        char[] harfler = str.toCharArray();
        int uzunluk = harfler.length;
        // Anagramları bulmak için kullanılacak bir boolean dizisi oluştur
        boolean[] kullanildi = new boolean[uzunluk];
        // Boş bir string oluştur, bu string anagramları oluştururken geçici olarak kullanılacak
        StringBuilder gecici = new StringBuilder();
        // Girilen stringin tüm anagramlarını bulmak için bir rekürsif fonksiyonu çağır
        anagramlariBulHelper(harfler, kullanildi, uzunluk, 0, gecici);
    }
    // Yardımcı fonksiyon: Tüm anagramları rekürsif olarak bulur
    public static void anagramlariBulHelper(char[] harfler, boolean[] kullanildi, int uzunluk, int seviye, StringBuilder gecici) {
        // Taban durumu: Geçici string uzunluğu girilen stringin uzunluğuna ulaştığında ekrana yazdır
        if (seviye == uzunluk) {
            System.out.println(gecici.toString());
            return;
        }
        // Her karakter için tüm olası seçenekleri dene
        for (int i = 0; i < uzunluk; i++) {
            // Kullanılmamış bir karakteri bul
            if (!kullanildi[i]) {
                // Karakteri seç ve işaretle
                kullanildi[i] = true;
                // Geçici stringe ekle
                gecici.append(harfler[i]);
                // Bir sonraki seviyeye geç
                anagramlariBulHelper(harfler, kullanildi, uzunluk, seviye + 1, gecici);
                // Geri al
                kullanildi[i] = false;
                gecici.setLength(gecici.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string ifade girin: ");
        String ifade = scanner.nextLine();
        System.out.println("Oluşturulabilecek anlamlı veya anlamsız kelimeler:");
        anagramlariBul(ifade);
        scanner.close();
    }
}
