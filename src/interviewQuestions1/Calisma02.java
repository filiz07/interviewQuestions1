package interviewQuestions1;

import java.util.Scanner;

public class Calisma02 {


    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str= scan.nextLine();

        System.out.println("lutfen tekrar etmesini istediginiz sayiyi giriniz");
        int sayi=scan.nextInt();

        ilkSonHarfler(str,sayi);


    }

    private static String ilkSonHarfler(String str, int sayi) {

        String str2=str.substring(0,1)+str.substring(str.length()-1);

        String output="";

        for (int i = 1; i <=sayi ; i++) {
            output+=str2;


        }
        System.out.println(output);




      return output;
    }
}
