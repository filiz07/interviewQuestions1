package practice_basic_day02;

import java.util.Scanner;

public class Q04_SwitchCase02 {
        /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran
		 * kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */
        public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
                System.out.println("lutfen harflerden birini seciniz :  \nA,\nB,\nC");
                char  harfler=scan.next().toUpperCase().charAt(0);

                switch (harfler){

                        case 'A':
                                System.out.println("java is easy");
                                break;
                        case 'B':
                                System.out.println("java is fun");
                                break;
                        case'C':
                                System.out.println("I need to study");
                                break;
                        default:
                                System.out.println("lutfen yazili olan harflerden birini seciniz");









                }













        }
}
