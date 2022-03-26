package practice_basic_day03;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        String karakter="";

            do{
                System.out.println("lutfen harf giriniz");

                karakter= scan.nextLine();
                System.out.println("program calisiyor");


            }while(!karakter.equalsIgnoreCase("x"));

        System.out.println("program bitti");









    }






}
