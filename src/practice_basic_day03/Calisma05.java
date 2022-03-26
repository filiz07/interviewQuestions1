package practice_basic_day03;

import java.util.Scanner;

public class Calisma05 {
    public static void main(String[] args) {


          /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk)
  FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 47 den kucuk bir tam sayi giriniz");

       int sayi= scan.nextInt();

        FIBONACCI(sayi);

    }

    private static void FIBONACCI(int sayi) {
        int sayi1=0;
        int sayi2=1;
        int sayi3 ;
        System.out.println("sayi1"+"-");
        System.out.println("sayi2"+"-");
        if (sayi<47){
            for (int i = 0; i <sayi ; i++) {




            }


        }







    }
}
