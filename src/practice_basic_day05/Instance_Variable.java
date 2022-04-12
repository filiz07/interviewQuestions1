package practice_basic_day05;

import java.util.Scanner;

public class Instance_Variable {
    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */

    public static void main(String[] args) {

        String isim="ayse";
        String soyisim="yildirim";
        int okulNo=123;

        isimDegistir(isim,soyisim,okulNo);//fatma kodat 321
        System.out.println(isim + soyisim + okulNo);//ayseyildirim123

        soyisimDegistir(soyisim);

    }

    private static void soyisimDegistir(String soyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yeni bir soyisim giriniz");
        String soyisim2= scan.nextLine();

        soyisim=soyisim2;
        System.out.println(soyisim);

    }

    private static void isimDegistir(String isim, String soyisim, int okulNo) {
        isim="fatma";
        soyisim="kodat";
        okulNo=321;

        System.out.println(isim+" "+soyisim+" "+okulNo);
    }


}
