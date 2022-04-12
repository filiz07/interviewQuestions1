package practice_free;

import java.util.Scanner;

public class calisma01 {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yapacaginizi islemi + - * / sembol kullarak seciniz");
        char islem=scan.next().charAt(0);

        System.out.println("kullanacaginiz  1.sayiy giriniz");
        double sayi1=scan.nextDouble();

        System.out.println("kullacaginiz 2.sayiyi saciniz");
        double sayi2=scan.nextDouble();

        hesapMakinasi1(islem,sayi1,sayi2);


    }

    private static void hesapMakinasi1(char islem, double sayi1, double sayi2) {


        switch(islem){
            case '+':
                System.out.println("toplama islemi sonuc "+ sayi1+sayi2);
                break;
            case '-':
                System.out.println("cikarma islem sonucu "+ (sayi1-sayi2));
                break;
            case '/':
                System.out.println("bolma islem sonucu "+ (sayi1/sayi2));
                break;
            case '*':
                System.out.println("carpma islem sonucu "+(sayi1*sayi2));
                break;
            default :
                System.out.println("lutfen dort islemden birini seciniz");








        }
    }


}
