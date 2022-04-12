package interviewQuestions3;

import java.util.Scanner;

public class Calisma02 {


    /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str=scan.nextLine();


        tersStr(str);
        stringBuildertersStr(str);




    }

    private static void stringBuildertersStr(String str) {
        String tersStr1 = "";
        StringBuilder sb=new StringBuilder(str);
       String terStr1=sb.reverse().toString();


        if (tersStr1.equalsIgnoreCase(str)){
            System.out.println(tersStr1+" : kelime palindrome dur ");

        }else
            System.out.println(tersStr1 + " palindrome degildir");





    }

    private static void tersStr(String str) {
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr += str.charAt(i);}

        System.out.println(tersStr);

            if (tersStr.equalsIgnoreCase(str)){
                System.out.println(tersStr+" : kelime palindrome dur ");

        }else
                System.out.println(tersStr + " palindrome degildir");



}
}
