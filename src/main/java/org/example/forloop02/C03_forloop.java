package org.example.forloop02;

import java.util.Scanner;

public class C03_forloop {
    public static void main(String[] args) {
         /* Kullanicidan 100'den kucuk bir pozitif tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir pozitif tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>0&&sayi<100){


        for (int i = 1; i <sayi ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        }else System.out.println("lutfen 100'den kucuk pozitif bir tam sayi giriniz");

        /*
    Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
         1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
         - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
         - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
         - Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
     */
    }
}
