package practice_free;

import java.util.Scanner;

public class Calisma04 {
    public static void main(String[] args) {

         /*
    cm olarak verilen bir sayiyi, metre ve kilometreye
     donusturen bir method yaziniz
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cm degerinde sayi giriniz");
        double sayi=scan.nextDouble();


        donustur(sayi);


    }

    private static void donustur(double sayi) {

        double metre=sayi/100;
        double kilometre=sayi/100000;

        System.out.println("girdiginiz cm cinsinden sayi  "+sayi +" = "+ metre+ "metre "+
                kilometre+ "kilometredir");


    }
}
