package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.nextLine().toLowerCase();
        int karakter=kelime.length();


        if (karakter%2!=0 && karakter>=3){
            System.out.println(kelime.charAt(karakter/2));
        }else {
            System.out.println("cift sayida karakter iceriyor");
        }


    }
}