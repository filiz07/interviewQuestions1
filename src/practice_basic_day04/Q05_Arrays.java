package practice_basic_day04;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
               int arr[]={1,2,3,4,5,6,7,80};
               int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
           if (arr[i]%3<=0){
               sayac++;

            }

        }
        System.out.println(sayac);






    }
}
