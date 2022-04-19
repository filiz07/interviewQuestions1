package interviewQuestions4;

import java.util.ArrayList;

public class Calisma02 {
    public static void main(String[] args) {


        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.



        ArrayList<Integer> list = new ArrayList<Integer>();


        randomEkle1(list);


    }

    private static void randomEkle1(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() *20));

        }
        System.out.println(list);

       int sayac=0;

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)%2==0){

                sayac++;
                list.set(i,111);
            }
        }
        if (sayac==0){

            System.out.println("cift sayi yoktur ");

        }




    }
}
