package practice_free;

import java.util.Scanner;

public class Calisma07 {
    public static void main(String[] args) {

        /*
		Interview Question
		 Write a Java program to reverse a string.
		  Use for loop and create a method called reverseString
		  */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str= scan.nextLine();

        tersineCevir(str);
        System.out.println("tersine cevilmisi : "+tersineCevir(str));


    }

    private static String tersineCevir(String str) {
        String str2="";

        for (int i =str.length()-1; i >=0 ; i--) {

            str2+=str.charAt(i);




        }
        return str2;
    }
}
