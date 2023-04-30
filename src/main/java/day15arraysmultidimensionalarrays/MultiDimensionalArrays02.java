package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        //MultiDimensionalArray kısa yoldan nasıl olusturulur?
        char arr[][] = { {'a' , 'b'} , {'C' , 'D' , 'E'}, {'?'}};

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]

        //bir string multidimesional arrayde içinde "a" olan elemanları concoea yazdırınız.
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w : brr){
            for (String k : w){
                if (k.contains("a")){
                    System.out.print(k + " ");//learn java easy
                }
            }
        }



    }
}
