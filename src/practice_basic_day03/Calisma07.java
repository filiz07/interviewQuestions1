package practice_basic_day03;

public class Calisma07 {
    public static void main(String[] args) {


        //  // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


       // for (int i = 0; i <=255 ; i++) {
          //  char karakter=(char)i;

          //  System.out.println(i+"-"+karakter);
        //}



        int sayi=0;
        while (sayi<=250 && sayi>=0){

            char karakter=(char)sayi;

            System.out.println(sayi+"-"+karakter);

            sayi++;
        }







    }
}
