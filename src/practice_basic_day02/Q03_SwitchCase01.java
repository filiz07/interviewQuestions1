package practice_basic_day02;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        String haftaninGunleri="pazartesi";
        switch (haftaninGunleri){
            case "pazartesi":
            case "sali":
                System.out.println("java dersi gunleri");
                    break;

            case "persembe":
            case "cuma":
                System.out.println("selenyum dersleri");
                break;

            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersler");
                break;
            default :
                System.out.println("izin gunu");





        }











    }
}
