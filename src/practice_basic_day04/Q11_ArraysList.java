package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
         String isim= scan.nextLine();

        // 2. adim
           List<String> isim2 = new ArrayList<String>();
           isim2.add(isim);
           if (isim2.contains(" ")){
               isim2.remove(" ");
               System.out.println(isim2);
           }


        // 3. adim



        // 4. adim










    }
}
