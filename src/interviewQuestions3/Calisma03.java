package interviewQuestions3;

import java.util.Scanner;

public class Calisma03 {

    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // bu kadar sayi yeter
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayac=0;
         while(sayac<10 && toplam<500){
             System.out.println("toplamak istediginiz sayilari giriniz");
             sayi=scan.nextInt();
             toplam+=sayi;
             sayac++;

             if (sayac<10  && toplam<500){
                 System.out.println(sayac + " adet sayi girdin "+ "sayilar toplami : "+ toplam);

             }else
                 System.out.println("bu kadar sayi yeter "+sayac + "  adet sayi girdin "+"sayilar toplami : "+toplam);


         }

    }
}
