package org.example.stringManipulations02;

public class C01_stringManipulations {
    public static void main(String[] args) {
        /*
        replace:data degisikligi yapmayi saglar
        replaceAll: coklu data(regex) degisikligi yapmayi saglar
        trim:bastaki ve sondaki bosluklari siler
        contains:icerme durumunu kontrol eder
        split:icilen girilen degere gore bolup sag ve sol olmak uzere secim yaptırıyo(0 sol)(1 sag)
        concat:birleştirme saglar
        charAt:girilen indexteki karakteri dondurur
        length:uzunlugunu verir yani karakter sayisida denebilir
        valueOf:baska datalari string'e cevirmeyi saglar
        indexOf:girilen karakterin ilk gorundugu andaki indexi verir(soldan sag dogru)
        lastIndexOf:girilen karakterin son gorundugu andaki indexini verir(soldan sag dogru)"alican"
        subString:ilk girilen indexten baslayarak 2. indexe(2. index dahil degil) kadar olan degeri dondurur.eger 2. indexi girmezsek 1. indexten sonuna kadar alır
        endsWith:ne ile bittigini kontrol eder
        startsWith:ne ile basladigini kontrol eder
        equals:esit mi diye kontrol eder (== farki ne? ==: hem deger bakar hemde nerden geldigine yani adrese equals ise sadece degere bakar)
        equalsIgnoreCase:buyuk kucuk farketmeksizin esit mi diye kontrol eder
        toLowerCase:harfleri kucukltur
        toUpperCase:harfleri buyultur
        isBlank:hem bos mu diye kontrol eder sadece bosluk karakteri iceriyor mu kontrol eder.
        isEmpty:sadece bos mu diye kontrol eder(space karakteri kontrol etmez)
         */
       //String str="Ali can";
       //System.out.println(str.isBlank());
       //System.out.println(str.isEmpty());

    /*
    Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.
    */
        String isim1=" V e l i C a n ";
        String isim2=" A h m e t F u r k a n ";
        String isim3=" Omer Faruk ";
       //isim1=isim1.trim();
       //isim2=isim2.trim();
       //isim3=isim3.trim();
       //System.out.println(isim1.split(" ")[1].length()+isim1.split(" ")[0].length());
        isim1=isim1.replace(" ", "");
        isim2=isim2.replace(" ", "");
        isim3=isim3.replace(" ", "");
        System.out.println(isim1.length() + isim2.length() + isim3.length());


    }
}
