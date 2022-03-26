package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki
    // rakamların toplamını bulunuz.


    public static void main(String[] args) {



        int sayi=635;
        rakamlarToplami(sayi);

        System.out.println(rakamlarToplami(sayi));


    }

    public static int rakamlarToplami(int sayi) {

        int toplam=0;
        while (sayi!=0){

            toplam+=sayi%10;
            sayi=sayi/10;

        }
        return toplam;




    }



}