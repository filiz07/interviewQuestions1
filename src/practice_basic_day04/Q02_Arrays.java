package practice_basic_day04;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */


        int input[]={1,2,3,4,5,6,7};
        int toplam=0;
        int ortalama=0;

        for (int i = 0; i <input.length ; i++) {

            toplam+=input[i];
        }
           ortalama=toplam/input.length;
        System.out.println(ortalama);

        for (int i = 0; i <input.length ; i++) {
            if (input[i]>ortalama) {
                System.out.println("ortalamadan buyuk sayila :"+input[i]);
            }

        }



// int arr [] = {1,2,3,4,5,6,7};
//        int toplam = 0;
//        for (int i = 0; i < arr.length; i++){
//            toplam +=arr[i];
//        }
//        double ortalama = toplam /arr.length;
//        System.out.println("ortalama = " + ortalama);
//        System.out.print("ortalamdan buyuk olan elemanlar :" );
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] > ortalama) {
//                System.out.print( arr [i] + " ");
//            }
//        }








    }
}