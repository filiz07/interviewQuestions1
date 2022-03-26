package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz
    // ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin
    // ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("String 1 :");
        String str1 = scan.nextLine();
        System.out.println("String 2 :");
        String str2=scan.nextLine();

        System.out.println("birlesim :"+ str1 + " " + str2 );
        System.out.println("2.birlesim :" + str1.concat(" "+str2));

        String str1ilksiz=str1.substring(1);
        String str2ilksiz=str2.substring(1);
        System.out.println("stringlerin ilk harfsiz halleri :"
                +str1ilksiz +" "+str2ilksiz);













    }
}
