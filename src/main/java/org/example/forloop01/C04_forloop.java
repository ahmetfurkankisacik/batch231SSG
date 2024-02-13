package org.example.forloop01;

public class C04_forloop {
    public static void main(String[] args) {
         /*
         Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
         */
        String str="alican bugun cok guzel java calisti";
        String bosStr="";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                bosStr+=str.charAt(i);

            }else {
                System.out.println(str.charAt(i)+" harfinden birden fazla var");
            }
        }
        System.out.println(bosStr);

    }
}
