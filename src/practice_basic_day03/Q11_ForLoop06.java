package practice_basic_day03;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Q11_ForLoop06 {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
    public static void main(String[] args) {
        int uzunKenar=5;
        int kisaKenar=3;

        for (int i= 1; i <=uzunKenar ; i++) {

            for (int j = 1; j <=kisaKenar ; j++) {
                System.out.print("* ");

            }System.out.println();
        }
    }

}
