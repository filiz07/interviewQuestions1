package interviewQuestions6;


import java.util.ArrayList;

public class Q06_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        String str="Javaisalsoeasy";

       char arr[]=str.toCharArray();

        ArrayList<Character>output=new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (arr[i]==arr[j] && !output.contains(arr[j])){

                    output.add(arr[j]);

                }

            }


        }System.out.println(" son durum "+ output);


    }





}

