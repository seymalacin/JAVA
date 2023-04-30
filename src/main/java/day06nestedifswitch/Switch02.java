package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*
        kullaniciya ay ismi sorunuz ve kulanicinin verdigi ay ismibden son aya kadar ekrana yazdiriniz
         */
        //Note: toLowerCase() methodu bir String'deki tum character'leri kucuk harfe cevirir.
        //      toUpperCase() methodu bir String'deki tum character'leri buyuk harfe cevirir.

        Scanner input = new Scanner(System.in);
        System.out.println("ay ismini giriniz");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi) {
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mais":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eyul":
                System.out.println("Eyul");
            case "ekim":
                System.out.println("Ekım");
            case "kasim":
                System.out.println("Kasim");
            case "araik":
                System.out.println("Araik");
                break;
            default:
                System.out.println("gecerli ay ismini giriniz");


        }
    }
}
