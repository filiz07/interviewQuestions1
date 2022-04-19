package interviewQuestions6;

import java.util.Scanner;

public class Q05_ExponentialNumber {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen taban icin sayi giriniz");
        int sayiTaban=scan.nextInt();

        System.out.println(" lutfen ust icin sayi giriniz");

       int sayiUst=scan.nextInt();

       int sonuc=1;

        for (int i = 1; i <=sayiUst ; i++) {
            sonuc*=sayiTaban;

        }
        System.out.println(" sonuc : "+ sonuc);





    }


}
