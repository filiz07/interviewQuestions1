package practice_basic_day02;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {


        int num=0;


        if (num>=0 && num<=9){
            if (num==9){
                System.out.println("dokuz");
            }else if(num==8){
                System.out.println("sekiz");

            }else if (num==7){
                System.out.println("yedi");
            }else if (num==6){
                System.out.println("alti");
            }else if (num==5){
                System.out.println("bes");
            }else if (num==4){
                System.out.println("dort");
            }else if (num==3){
                System.out.println("uc");
            }else if (num==2){
                System.out.println("iki");
            }else if (num==1){
                System.out.println("bir");
            }else
                System.out.println("sifir");


        }else
            System.out.println("gecersiz ");



        String sonuc=(num==9)? "dokuz": num==8 ?"sekiz" : num==7?"yedi"
                : num==6?"alti":num==5?"bes": num==4?"dort": num==3?"uc"
                :num==2?"iki":num==1?"bir":num==0?"sifir":"gecersiz";

        System.out.println(sonuc);















    }
}
