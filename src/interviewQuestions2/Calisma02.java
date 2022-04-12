package interviewQuestions2;

import java.util.Scanner;



public class Calisma02 {
    /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi degeri giriniz");
        String str=scan.next();

        ArmstrongSayi2(str);

    }

    private static void ArmstrongSayi2(String str) {

        String basamak[]=str.split("");

        int toplam=0;

        for (int i = 0; i < basamak.length ; i++) {
            toplam+=Math.pow(Integer.valueOf(basamak[i] ),basamak.length);


        }

        if (Integer.valueOf(str)==toplam){
            System.out.println(str + " sayi armstrong sayidir");
        }else
            System.out.println(str + " sayi armsrong sayi degildir");
    }


}
