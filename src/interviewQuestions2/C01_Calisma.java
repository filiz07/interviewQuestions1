package interviewQuestions2;

import java.util.Scanner;

public class C01_Calisma {
     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        ArmstrongSayi(sayi);
        girilensayiyakadararmstronsayi(sayi);


    }


    private static void ArmstrongSayi(int n) {
        int basamakatakiSayi = 0;
        int kuplerToplami = 0;
        int girilensayi=n;

        while (n > 0) {
            basamakatakiSayi = n % 10;
            kuplerToplami += (basamakatakiSayi * basamakatakiSayi * basamakatakiSayi);
            n = n / 10;


        }
        if (girilensayi == kuplerToplami) {
            System.out.println(girilensayi + "sayi armstrong sayidir");
        } else
            System.out.println(girilensayi + "armstrong sayi degildir");


    }

    private static void girilensayiyakadararmstronsayi(int sayi) {

        for (int i = 1; i <= sayi; i++) {
            ArmstrongSayi(i);

        }


    }
}