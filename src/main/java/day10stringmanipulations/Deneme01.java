package day10stringmanipulations;

import java.awt.image.Kernel;

public class Deneme01 {
    public static void main(String[] args) {


        // hanzelin mesajı 5 kere yazdırınız
        for (int i = 1; i < 6; i++) {
            System.out.println("hanzelin mesajı");

        }

        System.out.println();

        //10 dan 4 e kadar yazdırınız

        for (int i = 10; i > 3; i--) {
            System.out.print(i + ", ");

        /*
         10 ile 30 arasindaki (10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin.
         */
            for (int j = 10; j <= 30; j++) {
                System.out.print(j + " ,");

            }


            System.out.println();

            //Example 4: 14 den 5 ye kadar tum cift  sayilari ekrana yazdiran kodu yaziniz
            for (int j = 14; j > 4; j -= 2) {
                System.out.println(j + " ");
            }

            for (int j = 14; j >= 5; j--) {
                if (j % 2 == 0) {
                    System.out.print(j + ", ");
                }
            }


            //Example 3: Size verilen bir String'deki'm' den onceki characterleri yazdiriniz.
            //           Luxemburg ==> luxe
            String str = "Luxemburg";

            for (int j = 0; j < str.length(); j++) {

                char c = str.charAt(j);
                if (c == 'm') {
                    break;
                }
                System.out.print(c);
            }
            System.out.println();


            //Example 3: Size verilen bir String'deki'y' den onceki characterleri yazdiriniz.
            //          Ben bir sal yaptim ==> Ben bir sal

            String str2 = "Ben bir sal yaptim";
            for (int k = 0; k < str2.length(); k++) {
                char ch = str2.charAt(k);
                if (ch == 'y') {
                    break;

                }
                System.out.print(ch);

                System.out.println();

                // ****INTERVIEW SORUSU****
                //Example 4: size verilen bir String'i ters ceviren kodu yaziniz.
                //           "Kaba" ==> "abaK"

                String str3 = "Kaba";
                StringBuilder ters = new StringBuilder();
                for (int j = str3.length() - 1; j > -1; j--) {
                    char c = str3.charAt(j);
                    ters.append(c);
                }
                System.out.print(ters);

                System.out.println();
            }


        }


    }

}


