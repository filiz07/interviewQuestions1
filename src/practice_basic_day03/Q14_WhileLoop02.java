package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    public static void main(String[] args) {

        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        int sayi=20;
        for (int i = 1; i <=sayi ; i++) {
            if (i%2!=0){
                System.out.println(i);
            }

        }
        System.out.println(sayi);









// //  Kullanicidan bir sayi alin ve bu sayiyi
//        //  tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
//
//
//        // Kullanicidan bir sayi alin ve
//        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
//        int input=30;
//        // for loop ile de yapabiliriz ama biz
//        // while loop ile yapalim
//        int bolen=1;
//        int sayac=0;
//        while(bolen<=input){
//            if (input % bolen == 0){
//                System.out.print(bolen + " ");
//                sayac++;
//            }
//            bolen++;
//        }
//        System.out.println("");
//        System.out.println(input + " sayini bolen " + sayac + " adet sayi vardir");



    }














}
