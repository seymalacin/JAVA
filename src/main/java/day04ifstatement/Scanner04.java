package day04ifstatement;

import java.util.Scanner;

public class Scanner04 {


    public static void main(String[] args) {

       /*
       Kullanicidan ilk, orta ve soy ismini, kimlik numaranizi aliniz ve asagidaki formatta ekrana yazdiriniz
           Ali Mert Can
          123456789

        */

        // "Ctrl + /" yaptigimizda sectigimiz kodu kapatir.

        Scanner input = new Scanner(System.in);

        //1.Yol:
        System.out.println("Ilk isminizi giriniz...");
        String ilkIsim = input.next();// next() methodu kullanicidan String data'si almak icin kullanilir.

        System.out.println("Orta isminizi giriniz...");
        String OrtaIsim = input.next();

        System.out.println("Soy isminizi giriniz...");
        String SoyIsim = input.next();

        System.out.println("Kimlik numaranizi giriniz...");
        String KimlikNo = input.next(); // Matematiksel islem olmadigi icin String kullandik.

        System.out.println(ilkIsim + " " + OrtaIsim + " " + SoyIsim);
        System.out.println(KimlikNo);

        //2.Yol:
        System.out.println("Ilk, orta ,soy isminizi ve kimlik numaranizi giriniz...");
        String ilk = input.next(); //
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        /*
               next() ile nextLine() in farki nedir?
         next(): kullanicinin girdigi ilk kelimeyi alir
         nextLine(): kullanicin girdigi butun String'i bastan sona alir.

         */

        //3.Yol:

        System.out.println("Ilk, orta ,soy isminizi giriniz");
        String tamIsim = input.nextLine(); //
        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi giriniz");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);

        //Mac ==> Command + /  sectigimiz kodu kapatir
        //Windows ==> ctrl + / sectigimiz kodu kapatir
    }
}
