package interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;

public class Calisma05 {
    public static void main(String[] args) {



     /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
        ArrayList<String> liste=new ArrayList<String>(Arrays.asList("$13","$15","$20"));

        getSum1(liste);

        System.out.println( "toplam sayilar : "+getSum1(liste));

    }

    private static int getSum1(ArrayList<String> liste) {

        int toplam=0;
        for (int i = 0; i < liste.size() ; i++) {
            String str=liste.get(i).replace("$","");
            toplam+=Integer.parseInt(str);


        }
        if (toplam<0)
            return -1;
        else
            return toplam;

    }
}
