package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*
        EXAMPLE:
        kuanicidan gun sayisini ainiz ve gun ismini ekrana yaziniz
        1== > pazar  2 ==> pazartesi ....
         */

        Scanner input = new Scanner(System.in);
        System.out.println("GUN NUMARASINI GİRİNİZ");
        byte gunNo = input.nextByte();

        //1. yol :if ile cozunuz
        if (gunNo == 1) {
            System.out.println("pazar");
        } else if (gunNo == 2) {
            System.out.println("pazartesi");
        } else if (gunNo == 3) {
            System.out.println("sali");
        } else if (gunNo == 4) {
            System.out.println("carsamba");
        } else if (gunNo == 5) {
            System.out.println("persembe");
        } else if (gunNo == 6) {
            System.out.println("cuma");
        } else if (gunNo == 7) {
            System.out.println("cumartesi");
        } else {
            System.out.println("gecerli gun sayısı gıırnız");


            //2.yol : switch ile cozunuz //switch if elsenın yapdıgı herseyı yapar//case=durum
            switch (gunNo) {
                case 1:
                    System.out.println("pazar");
                    break;// koymassak verileri alt alta yazdırır sormadan
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
                default://yukarda verdimiz durumların dısındakı her durum
                    System.out.println("Gecerli gun sayisi giriniz");
            }
        }


    }


}