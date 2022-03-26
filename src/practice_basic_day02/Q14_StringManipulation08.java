package practice_basic_day02;

public class Q14_StringManipulation08 {

    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise
		 "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
    public static void main(String[] args) {


        String name1="mehmet";
        String name2="ahmet";
        int name1orta=(name1.length())/2;


        if (name1.length()%2==0){
            System.out.println(name1.substring(0,(name1orta)) + name2 +
                    name1.substring((name1orta) , name1.length()-1));

        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

        }





    }
}
