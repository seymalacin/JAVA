package day09stringmanipuations;

import java.util.Scanner;

public class IlkSoruCocumu {
    public static void main(String[] args) {


                //Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.

                //       Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen bir sayi giriniz...");
//        int sayi = input.nextInt();
//
//        if (sayi%2==0) {
//            System.out.println("Cift sayi");
//        } else {
//            System.out.println("Tek sayi");
//        }

  /*
Example 2: Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
Teklif 80.000'in uzerinde ise "Kabul ediyorum",
60000-80.000 arasinda ise "Konusabiliriz".
60.000'in altinda ise "Maalesef Kabul edemem" yazdirin.
 */
//        System.out.println("Maas teklifiniz giriniz");
//        double teklif = input.nextDouble();
//
//        if (teklif > 80000) {
//            System.out.println("Kabul ediyorum");
//        } else if (teklif >=60000 && teklif <=80000) {
//            System.out.println("konusabiliriz");
//        } else if (teklif <60000 && teklif >0) {
//            System.out.println("Maalesef kabul edemem");
//        } else {
//            System.out.println("lutgen gecerli bir maas giriniz");
//        }
//

        /*
Example 3: Bir sifre giriniz
Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
 */

//        System.out.println("Bir sifre giriniz");
//        char sifre = input.next().charAt(0);
//
//        if (sifre >= 'A' && sifre <= 'Z') { // buyuk harfler arasinda
//            if (sifre == 'A') {
//                System.out.println("Gecerli sifre");
//            } else {
//                System.out.println("gecersiz sifre");
//            }
//        } else if (sifre >= 'a' && sifre<='z') { // kucuk harfler arasinda
//            if (sifre=='z') {
//                System.out.println("Gecerli sifre");
//            } else {
//                System.out.println("Gecersiz sifre");
//            }
//        }

          /*
Example 4: Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
i)Yil 100 e bolunursa 400 e de bolunmelidir. ==> 1600+ (artik yil) 1800-(artik yil degil)
ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil)  2001-(artik yil degil)

Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
 Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.
 Dört yılda bir gelen 366 günlük yil
 */

//        int artikYil = 2000;
//
//        if (artikYil%100==0) {
//            if (artikYil%400==0) {
//                System.out.println("Artik yil");
//            } else {
//                System.out.println("Artik yil degil");
//            }
//        } else if (artikYil%4==0) {
//            System.out.println("Artik yil");
//        } else {
//            System.out.println("Artik yil degil");
//        }

         /*
Example 4: Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
i)Yil 100 e bolunursa 400 e de bolunmelidir. ==> 1600+ (artik yil) 1800-(artik yil degil)
ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil)  2001-(artik yil degil)

 */

//        int artikYil = 1990;
//
// String sonuc = artikYil%100==0 ? (artikYil%400==0 ? "Artik yil" : "Artik yil degil") : (artikYil%4==0 ? "Artik yil " : "Artik yil degil");
//
// System.out.println(sonuc);
//


        /*
Example 6:
Kullanicidan gun ismini yazmasini isteyin.
Girilen isim gecerli bir gun ise gun isminin 1.,2.ve3.harflerini
harf buyuk diger harflerini kucuk olarak yazdirin,
gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.
*/

               Scanner input = new Scanner(System.in);
                System.out.println("Gun ismi giriniz");
                String gunNo= input.nextLine();

                if (gunNo.equalsIgnoreCase( "pazar")) {
                    System.out.println("PAZar");
                } else if (gunNo.equalsIgnoreCase("pazartesi")) {
                    System.out.println("PAZartesi");
                } else if (gunNo.equalsIgnoreCase("sali")) {
                    System.out.println("SALi");
                } else if (gunNo.equalsIgnoreCase("carsamba")) {
                    System.out.println("CARsamba");
                } else if (gunNo.equalsIgnoreCase("persembe")) {
                    System.out.println("PERsembe");
                } else if (gunNo.equalsIgnoreCase("Cuma")) {
                    System.out.println("CUMa");
                } else if (gunNo.equalsIgnoreCase("cumartesi")) {
                    System.out.println("CUMartesi");
                } else {
                    System.out.println("Lutfen gecerli gun ismi giriniz");
                }


            }
        }




























