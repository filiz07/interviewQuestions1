package interviewQuestions3;

import java.util.ArrayList;




public class Calisma05 {
    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line



    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // method should add the element at the first index of arraylist

    public static void main(String[] args) {
        //PART 1 :
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("red");
        liste.add("green");
        liste.add("blue");
        liste.add("yellow");

        System.out.println(liste);



        //PART 2:

        for (int i = 0; i < liste.size() ; i++) {
            System.out.println(liste.get(i));

        }

        ilkindexeEkle(liste);
        System.out.println(liste);


        //PART : 3

        sonIndexeEkle(liste);
        System.out.println(liste);








    }

    private static void sonIndexeEkle(ArrayList<String> liste) {
        liste.add(liste.size(),"black" );
    }

    private static void ilkindexeEkle(ArrayList<String> liste) {

        liste.add(0,"white");
    }
}
