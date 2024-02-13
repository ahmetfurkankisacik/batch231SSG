package org.example.forloop02;

public class C04_forloop {
    public static void main(String[] args) {
          /*
         Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
         */
        String str="alican bugun cok fazla java calisti";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i)+": tekrarsizdir");
            }
        }
    }
}
