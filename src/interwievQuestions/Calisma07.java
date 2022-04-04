package interwievQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Calisma07 {
    // /*
    //Create a function that takes an array and the difference between the largest
    //and the smallest numbers.
    //Ask user to enter array elements.
    //   kullanıcının girdigi bir array'in en buyuk elemani ile
    //   en kucuk elemanının  farkını bulan bir method create ediniz.
    //*/


    public static void main(String[] args) {

        arryolustur();



    }

    private static void arryolustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("array uzunlugunu girin :");
        int uzunluk=scan.nextInt();

        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin "+(i+1)+" .elemani girin");
            arr[i]=scan.nextInt();


        }
        Arrays.sort(arr);
        System.out.println(arr[uzunluk-1]+ " "+ arr[0]);
    }
}
