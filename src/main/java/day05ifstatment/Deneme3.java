package day05ifstatment;

import java.util.Scanner;

public class Deneme3 {
    public static void main(String[] args) {

        //Example1: Kullanicidan haftanin kacingi gunu oldugunu sorun ve gun ismini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Haftanin gununu giriniz");
        int haftalikGun = input.nextInt();

        switch (haftalikGun) {
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun sayisi giriniz. Ornegin: 1,2,3,4,5,6,7");


        }
    }
}