package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin
    // ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi  yaziniz");
        String isim=scan.nextLine().toLowerCase();
        System.out.println("soyisminizi  yaziniz");
        String soyisim=scan.nextLine().toLowerCase();
       int isim1=isim.length();
       int soyisim1=soyisim.length();

       if (isim1>soyisim1){
           System.out.println("isminiz daha uzun");


       }else if (soyisim1>isim1){
           System.out.println("soyisminiz daha uzun");
       }else{
           System.out.println("isim ve soyisminiz esit uzunlukta");
       }







    }

}
