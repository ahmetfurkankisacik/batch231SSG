package org.example.forloop03;

public class C04_forloop {
    public static void main(String[] args) {
        /*
         Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
         */

        String str="yusuf";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i)+" bu karakter tekrarsizdir");
            }
        }
    }
}
