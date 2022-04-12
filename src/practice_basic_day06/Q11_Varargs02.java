package practice_basic_day06;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {



        double sayi1=10;
        double sayi2=20;
        double sayi3=30;

        toplamSayi(sayi1,sayi2,sayi3);

    }

    private static Double  toplamSayi(double...sayi) {

        double toplam=0;
        for (double each:sayi
             ) {
            toplam+=each;

        }
        System.out.println(toplam);


        return toplam;
    }


}
