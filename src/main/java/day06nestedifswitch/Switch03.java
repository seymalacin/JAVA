package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Note: Switch de sadece int, byte, short, char, String data tipleri kullanilabilir
        //Note: Eger 3 den fazla durum varsa switch() tercih ederim

        // kulanicidan işlem ve iki tane sayi alarak işlemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz

        Scanner input = new Scanner(System.in);
        System.out.println("işlemi giriniz, +,-,*,/,%");
        char işlem = input.next().charAt(0);

        System.out.println("ik sayiyi giriniz");
        double ilk = input.nextDouble();

        System.out.println("ik sayiyi giriniz");
        double ikinci = input.nextDouble();

        switch (işlem) {
            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println(ilk % ikinci);
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir...");

        }
    }
}
