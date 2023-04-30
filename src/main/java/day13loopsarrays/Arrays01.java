package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        1)Aynı data tipinde, coklu data'i depolamak için java'nin olusturdugu yapilar vardir
         Bu yapilarin birisi de "Array" lerdir.

          [] = array demektır java array oldugunu anlar
         */

        //Array nasıl olusturulur?
        int stdAges[] = new int[7];//[0,0,0,0,0,0,0 ]

        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasıl eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));//[0,11,0,0,0,0,0]


        //Array'deki herhangi bir elemanı nasıl yazdırabiliriz?
        System.out.println(stdAges[4]);//10

        //Example 1: Array'deki en kucuk en buyuk elemanı ekrana yazınız
        Arrays.sort(stdAges);//kucukden buye sıralamaya alıyo short
        System.out.println(Arrays.toString(stdAges));//[10,11,12,,12,12,13,14]..

        int ilk = stdAges[0];
        //Note: "lenght()" stringlerde kullanılır , "lenght" arraylerde kullanılır
        int son = stdAges[stdAges.length - 1];
        System.out.println(ilk + son);//24

        //Example 2: stdAges Array'i içindeki yum elemanların toplamını ekrana yazdiran kodu yazınız
        //1.yol:for-loop
        int sum = 0;
        for (int i = 0; i < stdAges.length; i++) {

            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.yol:while-loop
        int i = 0;
        int toplam = 0;
        while (i < stdAges.length) {
            sum = sum + stdAges[i];
            i++;
        }
        System.out.println(toplam);

        //3.yol:do-while-loop
        int k = 0;
        int s = 0;

        do {
            s = s + stdAges[k];
            k++;

        } while (k < stdAges.length);
        System.out.println(s);

        //4. yol:for each loop  Array'lerde ve Collections'larda kullanılır (****en gelısmıs loop dur****)
        int t = 0;
        for (int w : stdAges) {
            t = t + w;
        }
        System.out.println(t);

        //Example 3:string bır arry olusturunuz
        //          bu array'e 5 tane isim yerlestırınız
        //          bu ıslemcılerdekı karakter sayılarının toplamını ekrana yazınız

        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karakterSayılatıToplami = 0;
        for (String w : stdNames) {
            karakterSayılatıToplami = karakterSayılatıToplami + w.length();
        }
        System.out.println(karakterSayılatıToplami);//18

        //Example 4:Char bir array olusturunuz
        //          bu array'e 5 eleman ekleyınız
        //          bu array dekı sadece buyuk harfleri ekrana yazınız

        char ch[] = {'A', 'c', 'D', 'k', 'm'};
        for (char w : ch) {
            if (w >= 'A' && w <= 'Z') {
                System.out.println(w);
            }
        }
    }
}
