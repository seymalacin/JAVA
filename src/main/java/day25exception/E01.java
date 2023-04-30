package day25exception;

public class E01 {

    /*
      1)"Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir. //BEKLLENMEDİK HATA//
      2)Exception'lar ile calismanin iki yolu vardir
         a) try-catch block kullanma ve exception olussa bile calismayi devam ettirme
         b) throw exception kullanarak calismayi durdurma
          (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz gerekiyor ise
          bu dosyamiz eger silinmis ise Java dosyayi bulamaz ve uygulamanin devam etmesi gerekmez)
      3)Eger exception'i handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
      4)try-catch kullanirken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz.
      5)try-catch olmaksizin yanliz kullanilamaz.
      6)Eger yazmis oldugunuz herhangi bir kod satirinde problem olabilecegini dusunuyorsaniz try-catch block icine koymalisiniz.
      7)Catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
      8) e.getMessage() methodunu kullanarak teknik mesajlar elde edebiliriz.
        System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
        e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder.
        System.err.println(): hata mesajini renkli olarak verir. Bu sayede consolda diger mesajlardan ayirmak icin kullaniliriz.
     9)Eger try body icindeki kod sorunsuz calisirsa



     */
    public static void main(String[] args) {
//
//        divide(6, 2);//3
//        divide(0, 2);//0
//        divide(6, 0);//Matametikte bir sayi 0 ie bolunemez

        divide2(5, 0);
        divide2(3, 0);
    }

    //public static void divide(int a, int b) {
    //   System.out.println(a / b);// sadece bu şekilde birakirsak code'yi calisdirdikdan sonra error aliriz
    // }


    //1.Yol: Tavsiye edilmez
    //Bir deveoper icin tum matemetik kurallari ezbere bilmek mumkun degilidr
    public static void divide(int a, int b) {

        if (b == 0) {
            System.out.println("Bir sayi sifir ile bolunemez");
        } else {
            System.out.println(a / b);

        }

    }
    //2. yo try-catch kullanarak exception'ı handle etmek tavsiye edilir.

    public static void divide2(int a, int b) {

        try {
            System.out.println(a / b);
            System.out.println("hi exception");
            System.out.println("bye exception");
        } catch (ArithmeticException e) {
            System.out.println("Bolme isleminde bir problem olustu");

        }
        //java matematik ile ilgili karsilasilmasi muhtemel tum istisnalari, hatalari ArithmeticException class'ina koymustur.
        //Matematikteki tum istisnallari detaylari bilmek zorunda degiliz

    }
}
