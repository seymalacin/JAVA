package day05ifstatment;

import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  toplama cikarma bolme  ile isleme koyup sonucu yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("toplama için 7 \n cikarma için 3 \n bölme icin 9 \n");

        double islem = input.nextDouble();

        System.out.println("iki sayi giriniz");

        double sayi4 = input.nextDouble();
        double sayi5 = input.nextDouble();

        if (islem == 7) {
            System.out.println(sayi4 + sayi5);
        } else if (islem == 3) {
            System.out.println(sayi4 - sayi5);
        } else if (islem == 9) {
            System.out.println(sayi4/sayi5);

        }else System.out.println("isdenılen degeri giriniz ");
    }
}
