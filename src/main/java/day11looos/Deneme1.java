package day11looos;

public class Deneme1 {
    public static void main(String[] args) {


        //Example 2: 1'den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz
        for (int i = 1; i < 101; i++) {
            if (i % 6 == 0) {

                continue;
            }
            System.out.print(i + " ");


            System.out.println();
            //Example 2: 6 den 3 a kadar tamsayıların carpımını bulan kodu yaziniz.
            int carpma = 1;
            for (int j = 6; j > 2; j--) {
                carpma = carpma * j;

            }
            System.out.println(carpma);
        }

    }

}