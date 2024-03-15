package org.example.exception;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("uygulmamıza hoşgeldiniz.");
        System.out.println("lutfen yaşınızı giriniz");
        int yas= scan.nextInt();
        if (yas>15){
            
        }else {
           throw new AgeException("yasiniz 15'ten kucuk!!!");
        }
    }
}
