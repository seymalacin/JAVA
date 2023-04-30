package day08StringManipulation;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {


        //Example 1 : kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz
        //            Ramazan ==> Rn
        Scanner input = new Scanner(System.in);
        System.out.println("llutfen isminizi giriniz");
        String isim = input.next();

        //1.yol:
        char ilkHarf = isim.charAt(0);

        char sonHarf = isim.charAt(isim.length() - 1); //Yazdiginiz kod bazi durumlar için calisirsa o code "hard coding" denir.
        //Yazdiginiz kod her durumlar için calisirsa o code "dymnamic coding" denir.
        System.out.println("" + ilkHarf + sonHarf);


        // 2.yol:
        String ilk = isim.substring(0, 1);
        String son = isim.substring(isim.length() - 1);

        System.out.println(ilk + son);


        //Example 2: verilen string deki sadece hayvan isimlerini ekrana yazdiriniz
        //           "ben kedi ,esim tavuk , ogum sever inek "
        //            012345678

        String str = "ben kedi ,esim tavuk , ogum sever inek";

        // substring() in iki kulanimi vardir
        // 1) substring( baslangic indexi, bitis indexi ) String'in ortasindan bir parca almaya yarar
        // 2)substrinin (baslangiç indexi) Stringin verilen indexten sonuna kadar almaya yarar

        String kedi = str.substring(4, 8);
        String tavuk = str.substring(15, 20);
        String inek = str.substring(34);
        System.out.println(kedi + tavuk + inek);


        //example 3: ilk isim ve soy ismini iceren isimlerden ilk ve soy isimlerinin bas harflerini ekrana yazdiriniz
        //         Ali Can ==>AC   Tahsin Yurdakul == >TY
        System.out.println("ilk ve soy isminizi giriniz");
        String tamİsim = input.nextLine();

        String a = tamİsim.substring(0, 1);

        tamİsim.split(" ")[1].substring(0, 1);


    }
}
