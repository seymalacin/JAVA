package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //Example 1: kullanıcıdan bır sayı alınız, sayı 100 den kucuk ise ekrana "Kazandın!" yazdırınız.
        //           Aksi kalde ekrana "Kaybettin!" yazdırınız.
        //           kullanıcı kazandıkca oyun devam etmeli,

        Scanner input = new Scanner(System.in);
        int sayı = 0;
        do {
            System.out.println("Bir sayı giriniz");
            sayı = input.nextInt();
            if (sayı<100){
                System.out.println("Kazandiniz");
            }

        }while (sayı<100);
        System.out.println("Kaybettiniz");

       // Example 2:kullanıcıdan ısımler alınız ilk harfinin buyuk harf olup olmadıgını kontrol edınız.


        do {
            System.out.println("Isım gırınız");
            char ilkHarf = input.next().charAt(0);
            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("ismi basarıyla girdiniz");

            } else {
                System.out.println("isim yanlis gırdıgınız ıcın isminız ıptal olmustur");
                break;
            }
        } while (true);

        //Infinite Loop : Sonsuz dongu
        // Artırma azaltma kısmında hata yaparsanız "infinite loop sorunsal" i olusur.(-- olunca sonsuz dongu)
        for (int i = 1; i < 4; i++) {
            System.out.println("Hi!");
        }
        // Artırma azaltma kısmında hata yazmassanız "infinite loop sorunsal" i olusur.
        for (int i = 1; i < 4; ) {
            System.out.println("Hi!");

        }
        // Artırma azaltma kısmında hata yazmassanız "infinite loop sorunsal" i olusur.
        int i = 12;
        while (i<15){
            System.out.println("Hi!");
        }


    }
}

