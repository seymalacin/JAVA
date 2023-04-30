package day11looos;

public class ForLoop01 {
    public static void main(String[] args) {


        //tekrarlı ısler herzaöan oop dur

        //Example 1: 3 den 6 a kadar tamsayıların toplamini bulan kodu yaziniz.

        int sum = 0;
        for (int i = 3; i < 7; i++) {

            sum = sum + i;
            System.out.println(sum);
        }
        //Note: System.out.println(sum); loop'un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir
        //      System.out.println(sum); loop'un icine yazilirsa her bir lopp için "sum"in hangi degerlerini aldigini yazdirir.

        System.out.println(sum);


        //Example 2: 6 den 3 a kadar tamsayıların carpımını bulan kodu yaziniz.
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply = multiply * i;
        }
        System.out.println(multiply);



        /*
         javada tamsayıyı tamsayıya bolersenız sonuc tam sayı olur.
         eger sonuc vurgullu sayı ıse ; java ondalık kısmı siler
         */

        //Example 2: size verilen  bır sayının rakamlari toplamını buunuz.
        int num = 385;
        num = Math.abs(num);
        int sonuc = 0;
        for (int i = num; i > 0; i = i / 10) {
            sonuc = sonuc + i % 10;
        }
        System.out.println(sonuc);


        //Example 4: sıze verılen bır strıngı ters cevıren kodu yazınız
        //          "Kaba" ==> "abak"

        String str = "Kaba";
        //Concatenation yapacaksınız empty string ("") kullan
        String ters = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            ters = ters + c;
        }
        System.out.println(ters);


    }
}
