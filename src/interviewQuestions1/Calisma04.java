package interviewQuestions1;

import java.util.Scanner;

public class Calisma04 {
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin="sd.1234";
        int girisHakki=3;

      while (true) {
          Scanner scan = new Scanner(System.in);
          System.out.println("lutfen sifrenizi giriniz");
          String sifre = scan.nextLine();



              if (sifre.equals(pin)) {
                  System.out.println("dogru sifre girdiniz");
                  break;
              } else {
                  System.out.println("sifreniz yanlis");
                  girisHakki--;

                  System.out.println(girisHakki + "   giris hakkiniz kaldi");

              }
              if (girisHakki == 0) {

                  System.out.println("giris hakkiniz bitti. " + "  kartiniz bloke oldu");
                  break;
              }



      }
























    }
}
