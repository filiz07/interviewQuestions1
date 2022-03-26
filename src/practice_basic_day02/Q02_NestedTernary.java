package practice_basic_day02;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {


        char finalnotu='C';
        String result=" ";
        result=(finalnotu=='A'? "gayet basarili "
                :finalnotu=='B' ? "basarili"
                :finalnotu=='C'?"ha agyret"
                : "digerleri...");
        System.out.println("result=="+result);
    }
}
