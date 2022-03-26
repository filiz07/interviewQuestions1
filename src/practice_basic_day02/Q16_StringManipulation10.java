package practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@
    // " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

        String str="java ogrenmek123 Cok guzel@";
       String  str1=str.replaceAll("123" , " ");
       String str2=str1.replaceAll("@"," ").toLowerCase();

        System.out.println(str2);




    }
}
