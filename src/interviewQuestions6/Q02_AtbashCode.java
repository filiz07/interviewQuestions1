package interviewQuestions6;

import java.util.Scanner;

public class Q02_AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen sifrelenecek ifadeyi giriniz");
        String ifade= scan.nextLine().toLowerCase();

        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2= "zyxwvutsrqponmlkjihgfedcba";


        for (int i = 0; i <ifade.length() ; i++) {
            for (int j = 0; j <26 ; j++) {
                if (ifade.charAt(i)==str1.charAt(j)) {
                    System.out.print(str2.charAt(j));
                }

            }

        }


    }
}