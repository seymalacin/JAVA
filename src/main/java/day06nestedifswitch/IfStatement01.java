package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
       //Tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("utfen yasinizi giriniz");
        byte yas = input.nextByte();

        if (yas<0){
            System.out.println("gecerli yas giriniz");
        } else if (yas<5) { //yas<5=4 de denebilir digerlerı için de gecerli
            System.out.println("bebek ");
        } else if (yas<=13) {
            System.out.println("cocuk");
        } else if (yas<=21) {
            System.out.println("genç");
        } else if (yas<31) {
            System.out.println("yetişkin");
        }else {
            System.out.println("tanimlanmis evre");
        }
    }
}

