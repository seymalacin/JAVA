package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]

        int original[] ={0, 2, 3, 0, 12, 0};

        int yeni[] = new int[original.length];

        int idx = 0;

        for (int i = 0; i <original.length ; i++) {

            if (original[i] != 0){
               yeni[idx] = original[i];
               idx++;
            }

        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [2,1,2,-3,2] ==> kullanici 2 yi sordu ==> 2 elemani var ve 3 kere tekrarlandı
        //                        ==> kullanici 6 yi sordu ==> 6 elemani yok ve 0 kere tekrarlandı

        int arr[] ={2,1,2,-3,2};
        int eleman = 2;
        int counter = 0; //"flag" : bazı durumların olup olmadıgını kontrol etmek icin "flag" kullanılır

        for (int w : arr) {
            if (w==eleman){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(eleman + "array'de" + counter + "defa var");
        }else {
            System.out.println(eleman + "array'de yok");
        }

        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
       //           "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana

        String sentence =  "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);//Java kolaydir calisana ne kolay ki calismayana

        sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);//java kolaydır calısana ne kolay kı calısmayana

        String words[] =sentence.split(" ");//java, kolaydır, calısana ,ne, kolay, kı, calısmayana

        Arrays.sort(words, Comparator.comparingInt(String::length));//ne,ki,java,kolay,kolaydır,caisana,calisayana
        System.out.println(Arrays.toString(words));//[ne, ki, Java, kolay, kolaydir, calisana,, calismayana.]

        System.out.println(words[words.length-1]);//calısmayana


    }
}
