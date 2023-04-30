package day10stringmanipulations;

public class ForSoruCozum {
    public static void main(String[] args) {

        int i=1;

        while(i<=5){
            System.out.println(i + " ");
            i++;

        }


        int a=1;
        do
        {


            System.out.println(a);
            a++;
        } while (a<=5);


        int çarp=1;

        for (int k=1; k<=5; k++) {

            çarp =çarp*k;
            System.out.println(çarp);

        }



        int arr[]={1,2,3,4};

        for (int w  : arr ) {
            System.out.print(w+ " ");

        }


        int arr2[][]={{1, 2, 3, 4},{2,6,9}};

        for(int[] w : arr2){

            for(int y : w){
                System.out.println(y+ " ");
            }
        }
    }
}
