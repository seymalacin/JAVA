package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1: size verilen pozitif ve negatif sayılar içeren bir integer array'deki "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.
        int arr[] = {-12, 18, -5, 23, -2, 0};


        Arrays.sort(arr);// -12 -5 -2 0 18 23

        int maxNegative = arr[0];
        int minPositife = arr[arr.length-1];

        for (int w : arr){
            if (w<0){
                maxNegative = Math.max(maxNegative,w);
            }
            if (w>0){
                Math.min( minPositife, w);
            }

        }
        System.out.println(maxNegative +"and" + minPositife);
    }
}
