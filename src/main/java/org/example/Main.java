package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "HAYat cOK   GuZeL";
       // str=str.toUpperCase().charAt(0)+str.toLowerCase().substring(1);
       // System.out.println(str);
       // System.out.println(str.toUpperCase().charAt(0)+str.toLowerCase().substring(1,str.indexOf(" ")+1)
       //         +str.split(" ")[1].toUpperCase().charAt(0) + str.split(" ")[1].substring(1)+
       //      " "+str.split(" ")[2].toUpperCase().charAt(0) + str.split(" ")[2].substring(1));


        String result = "";

       boolean isFirst = true;
       for (int i = 0; i < str.length(); i++) {

           char c = str.charAt(i);
           if (isFirst && (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
               result += Character.toUpperCase(c);
               isFirst = false;
           } else {
               result += Character.toLowerCase(c);
           }
           if (c == ' ') {
               isFirst = true;
           }
       }
       System.out.println(result);

    }
}