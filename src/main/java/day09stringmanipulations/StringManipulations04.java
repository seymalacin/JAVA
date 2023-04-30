package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations04 {
    public static void main(String[] args) {


        String str = "Kara kara dusunme Ankara";

        // indexOf() method'u verilen character veya character'lerin "ilk gorunumunun" index'ini verir.

        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);

        // lastIndexOf method'u character veya character'lerin "son gorunumunun" index'ini verir.

        str.lastIndexOf("kara");
        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississippi";
        int idxI = s.indexOf('i'); // indexOf() hem string hem de char ile kullanilabilir
        System.out.println(idxI);//1

        int idxIss1 = s.indexOf("iss");// ilk gorunumun ilk karakterin indexini verir.
        System.out.println(idxIss1);//1

        int idxIss2 = s.lastIndexOf("iss");// son gorunumun ilk karakterin indexini verir.
        System.out.println(idxA2);//4

        //Example 1: bir stringdeki bir charecterin tekrarli veya tekrarsız olup ollmadigini gosteren kodu gırınız.
        //           "Helloooo" ==>   H-->Tekrarsiz   e--> Tekrarsiz   l--> Tekrarli    o--> Tekrarli


        String t = "Helloooo";
        char c = 'e';

        if (t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");
        }

        String u = "Learn java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra istenen character'in
        // ilk gorunumunun indexini return eder.

        int sonuc = u.indexOf("n", 5);
        System.out.println(sonuc);

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi "index" olarak kabul edip en bastan
        // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.

        String m = "hello everyone!";
        int e = m.lastIndexOf("e", 7);
        System.out.println(e);


        String v = " ";

        // isEmpty() methodu bir stringin bos olup olmadiginı kontrol dedr.
        // eger stringde hıc character yoksa isEmpty() "true" retrun eder, her hangi bir character varsa "false" retrun eder.
        // lenght()==0 demek isEmpty() true verır.
        // bir stringin bos olup olmadigini anlamak icin "lenght()==0" kullanmayın "isEmpty()" kullanin

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = " ";
        // isBlank() hem "bos string" icin hem de "sadece space" iceren stringller icin true retrun eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        //Example 2: kulllanicidan alinan isim mutlaka spaceden farklı en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz..");
        String ilk = input.nextLine();

        if (ilk.isBlank()) {
            System.out.println("sana ismini gir dedim");
        } else {
            System.out.println(ilk);
        }


    }
}
