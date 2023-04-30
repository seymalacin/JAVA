package day02methodcreation;

public class Car {

    // pasif ozellikler
    public String marka = "Honda";
    public int fiyat = 20000;

    /*
      NOTE: Class ==> veriablle ==> object ==> kullanacagız
                      method
     */

    public String renk = "Mavi";



    public static void main(String[] args) {

        //Object nasil olusturulur?
        //1) Class ismini yaziniz. 2) Objeye bir isim veriniz.  3) =   4) new keyword'unu kullan   5) Class ismi parantezle beraber(Constructor)
                   Car                      myHonda              =              new                          Car();


        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda
        System.out.println(myHonda.renk);//Mavi

        myHonda.hareketEt();
        myHonda.dur();

        MethodCreation obj = new MethodCreation();

        // MethodCreation class'indan object olusturduk
       // MethodCreation obj = new MethodCreation();
       // System.out.println(obj.toplamaYap(3, 5));// 8.0

    }

    public void  hareketEt(){
        System.out.println("Honda guzel hareket eder");
    }

    public void dur (){
        System.out.println("Honda guvenli bir sekilde durur....");
    }


}