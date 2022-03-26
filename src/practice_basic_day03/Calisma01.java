package practice_basic_day03;

import java.util.Scanner;

public class Calisma01 {
    public static void main(String[] args) {


         /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
         Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yapacaginiz islemi seciniz : * + = /");
        char islem=scan.next().charAt(0);

        System.out.println("lutfen bir tam sayi giriniz");
        double num1=scan.nextDouble();
        System.out.println("lutfen ikincibir tam sayiyi giriniz");
        double num2=scan.nextDouble();

        hesapMakinasi(islem,num1,num2);

    }

    public static void hesapMakinasi(char islem, double num1, double num2) {

        if (islem=='+' || islem=='-' || islem=='*' || islem=='/' ){

            switch(islem){

                case '+' :
                    System.out.println("sayilarin toplami :" + (num1+num2));

                    break;
                case '-' :
                    System.out.println("sayilarin farki :" + (num1-num2));

                    break;
                case '*':
                    System.out.println("sayilarin carpimi :"+ (num1*num2));

                    break;
                case '/':
                    System.out.println("sayilarin bolumu :" + (num1/num2));
                    break;
               // default :
                  //  System.out.println("hatali giris yaptiniz");

            }

        } else
            System.out.println("hatali giris yaptiniz");


    }
}
