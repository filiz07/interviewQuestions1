package practice_basic_day03;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */


    public static void main(String[] args) {

        String str="java";

        terstenYazilis(str);
    }

    private static void terstenYazilis(String str) {

        String terstenStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            terstenStr+=str.charAt(i);
        }
        System.out.println("girdiginiz kelimenin tersten yazilisi: "+terstenStr);




    }

}
