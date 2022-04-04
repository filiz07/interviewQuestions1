package practice_basic_day05.ObjeOlusturma_ogretmen;

public class OgretmenBilgileri {
    /* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin (variable lar buasamada static olmali..)
     * ve yazdirin
     *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
	 instance variable uretilmis demektir.
     */



    String isim ;
    String soyIsim ;
    String brans ;
   static int yas ;

    public static void main(String[] args) {

        //  C01_Static obj1=new C01_Static();

        OgretmenBilgileri obj1 = new OgretmenBilgileri();
        obj1.isim="hasan";
        obj1.brans="kimya";
        obj1.soyIsim="kodat";
        yas=40;
        System.out.println(obj1.isim+obj1.soyIsim+ obj1.brans);
        System.out.println(OgretmenBilgileri.yas);



        





    }





}
