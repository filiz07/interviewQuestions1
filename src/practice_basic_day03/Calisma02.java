package practice_basic_day03;

public class Calisma02 {
    public static void main(String[] args) {



         /*
            Problem tanımı :
            Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
            Test Data:
            input: "aabbcccccddddaaa"
            output: abcd
         */


        String str="aabbcccccddddaaa";
        enFazlaBirKezYaz(str);

    }

    public static void enFazlaBirKezYaz(String str) {
             String son="";
        for (int i = 0; i <=str.length()-1; i++)  {
            if (!son.contains(str.substring(i,i+1))){
                son+=str.substring(i,i+1);
            }

        }
        System.out.println(son);


    }
}
