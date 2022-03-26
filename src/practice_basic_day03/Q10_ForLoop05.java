package practice_basic_day03;

import java.util.Scanner;

public class Q10_ForLoop05 {
   /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

    public static void main(String[] args) {

        int sayi=4;

        int toplam=0;

        if (sayi>1){

            for (int i = 1; i <sayi ; i++) {
                  toplam+=(i*i);

            }
            System.out.println("karaler toplami "+ "="+toplam);

        }




        }







    }






