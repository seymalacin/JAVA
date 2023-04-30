package day05ifstatment;

import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucu yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println(" toplama ıslemı ıcın 1  \n cıkarma ıslemı icin 2 \n bolme islemi için 3 \n carpma islemi için 4 \n ");

        byte islem = input.nextByte();
        System.out.println("lutfen ıkı tam sayı giriniz");
        byte num1 = input.nextByte();
        byte num2 = input.nextByte();
        if (islem == 1) {
            System.out.println(num1 + num2);
        } else if (islem == 2) {
            System.out.println(num1-num2);
        } else if (islem ==3) {
            System.out.println(num1/num2);
        } else if (islem ==4) {
            System.out.println(num1*num2);
        }else System.out.println("lutfen gecerli bir sayi giriniz 1 2 3 4 ");
    }

    }


