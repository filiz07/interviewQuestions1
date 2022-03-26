package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine().toLowerCase();

        String cumleson=cumle.contains(" ") ? "bosluk iceriyor " : "bosluk icermiyor";
        System.out.println(cumleson);
        String cumle2=" ";

        String sonuc=cumle.equalsIgnoreCase(cumle2) ? " cumle bos" : "cumle bos degil";
        System.out.println(sonuc);








    }

}