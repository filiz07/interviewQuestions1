package interviewQuestions3;

import java.util.Scanner;

public class Calisma04 {

     /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str=scan.nextLine();

        System.out.println("lutfen ogrenmek istediginiz karakteri giriniz");
        char ch=scan.next().charAt(0);

        int toplam=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) ==ch){
                toplam++;
            }

        }
        System.out.println("istenilen toplam : "+toplam);









    }
}
